package ReadProperty;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadProperty {
	
	/**
	 * @author Veeru
	 * purpose: Read all properties using this config file
	 */
	private Properties property;
	public  static WebDriver driver;
	private String propertyFilePath="src"+File.separator+"test"+File.separator+"java"+File.separator+"Config"+File.separator+"config.properties";
	public ReadProperty() {
		try {
			BufferedReader reader=new BufferedReader(new FileReader(propertyFilePath));
			property=new Properties();
			try {
				property.load(reader);
				reader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			}catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("Config file is not found at "+propertyFilePath);
			}
		}
	
	public String getURL() {
		String url=property.getProperty("URL");
		return url;
	}
	public String readExcel() {
		String excel="src"+File.separator+"test"+File.separator+"resources"+File.separator+"testData"+File.separator+"";
		return excel;
	}
	public String getDriverPath() {
		String driverpath="src"+File.separator+"test"+File.separator+"resources"+File.separator+"browsers"+File.separator;
		
		if(property.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverpath+property.getProperty("ChromeDriver"));
			driver=new ChromeDriver();
		}else if(property.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverpath+property.getProperty("FireFoxDriver"));
			driver=new FirefoxDriver();
		}else if(property.getProperty("browser").equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", driverpath+property.getProperty("InternetExplorerDriver"));
			driver=new InternetExplorerDriver();
		}
		return driverpath;
		
	
	}
		
	}
	
	
