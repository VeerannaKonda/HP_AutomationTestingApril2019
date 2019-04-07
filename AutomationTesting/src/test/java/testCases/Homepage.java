package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class Homepage extends BaseClass {
	public WebDriver driver;
  @Test
  public void f() {
	  openURL();
	  close();
  }
}
