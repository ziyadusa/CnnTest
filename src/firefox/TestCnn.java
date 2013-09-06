package firefox;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCnn {
	WebDriver driver = null;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.cnn.com");
		driver.manage().window().maximize();
	}

	
	//Without helper method
	//If you mute @Test, it wouldn't execute
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.cssSelector("#nav-world")).click();
		driver.findElement(By.cssSelector("#nav-politics")).click();
		driver.findElement(By.cssSelector("#hdr-search-box")).sendKeys("politics");
		driver.findElement(By.cssSelector(".ftr-search-sicon>input")).click();
		Thread.sleep(2000);
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
	
	//Helper Method
	public void clickOnCss(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}
	
	public void typeByCss(String locator, String text) {
		driver.findElement(By.cssSelector(locator)).sendKeys(text);
	}

}
