package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Templat {
	WebDriver driver = null;
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.cnn.com");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  
  //Helper Methods
  public void clickOnCss(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
  }
	
	public void typeByCss(String locator, String text) {
		driver.findElement(By.cssSelector(locator)).sendKeys(text);
  }
	
	public void clickByXpath(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}


}
