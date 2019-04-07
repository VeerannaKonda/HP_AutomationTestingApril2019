package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage_Locators {
	WebDriver driver;
	By Shop=By.xpath("//a[contains(text(),'Shop')]");
	
	
	
	
	public void shop() {
		driver.findElement(Shop).click();
	}

}
