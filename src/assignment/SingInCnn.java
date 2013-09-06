package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SingInCnn extends Templat {
  //@Test
  public void f() throws InterruptedException {
	  	driver.findElement(By.cssSelector("#nav-world")).click();
		driver.findElement(By.cssSelector("#nav-politics"));
  }
  @Test
  public void test1() throws InterruptedException {
	  clickOnCss("#nav-world");
	  clickOnCss("#nav-politics");
	  typeByCss("#hdr-search-box","politics" );
	  clickByXpath("//*[@id='nav-sports']/span");
	  
  }
  
  
}
