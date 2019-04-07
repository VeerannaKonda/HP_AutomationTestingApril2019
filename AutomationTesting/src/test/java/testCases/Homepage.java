package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import org.testng.Assert;

public class Homepage extends BaseClass {
	public static WebDriver driverNULL;
@Test()
  public void TC_01() {
	  openURL();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	  int we=driver.findElements(By.xpath("//div[@class='row_inner_wrapper']")).size();
	  Assert.assertEquals("Expected Slides are not available", we==3);
	  System.out.println("Total Slides Count is :"+we);
	  close();
  }
}
