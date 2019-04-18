package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import org.testng.Assert;

public class Homepage extends BaseClass {
public static WebDriver driverNULL;

/**
 * @author Veeru
 * Purpose: Homepage TestCases
 */
@Test(enabled=false)
public void TC_01() {
	  openURL();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	  int we=driver.findElements(By.xpath("//div[@class='row_inner_wrapper']")).size();
	  Assert.assertEquals(true, we==3);
	  System.out.println("Total Slides Count is :"+we);
	  close();
  }
@Test(enabled=false)
public void TC_02() {
	  openURL();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	  int we=driver.findElements(By.xpath("//span[@class='price']")).size();
	  Assert.assertEquals(true, we==3);
	  System.out.println("Total Arrivals Count is :"+we);
	  close();
  }
@Test(enabled=true)
public void TC_03() {
	openURL();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	  int we=driver.findElements(By.xpath("//span[@class='price']")).size();
	  Assert.assertEquals(true, we==3);
	  System.out.println("Total Arrivals Count is :"+we);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  for(int i=0;i<=3;i++) {
			  driver.findElement(By.xpath("//ul[@class='products']//img[1]")).isDisplayed();
			  String prodcut=driver.findElement(By.xpath("//h3")).getText();
			  driver.findElement(By.xpath("//ul[@class='products']//img[1]")).click();
			  System.out.println("Product details are: "+prodcut);
			  String product1=driver.findElement(By.xpath("//h1[@class='product_title entry-title']")).getText();
			  System.out.println("Individual Prodcut Details are :"+product1);
//			  Assert.assertEquals("product1", "product");
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.xpath("//button[@type='submit']")).click();
			  String addedcart=driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText();
			  System.out.println(addedcart);
			  driver.findElement(By.xpath("//div[@id='site-logo']")).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }
		driver.close();
	}

}
