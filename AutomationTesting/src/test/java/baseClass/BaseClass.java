package baseClass;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ReadProperty.ReadProperty;

public class BaseClass extends ReadProperty{
	public Properties property;
	ReadProperty ReadProperty=new ReadProperty();
  public void openBrowser(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"browsers"+File.separator+"chromedriver.exe");
		  driver=new ChromeDriver();
	  }else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"browsers"+File.separator+"geckodriver.exe");
		  driver=new FirefoxDriver();
	  }else if(browser.equalsIgnoreCase("ie")) {
		  System.setProperty("webdriver.ie.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"browsers"+File.separator+"IEdriverServer.exe");
		  driver=new InternetExplorerDriver();
	  }
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }
  
  public void openURL() {
	  ReadProperty.getDriverPath();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get(ReadProperty.getURL());
	  
  }
  
  public void close() {
	  driver.close();
  }
  
  
  
}
