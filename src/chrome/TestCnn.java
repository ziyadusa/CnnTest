package chrome;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCnn {
	WebDriver driver = null;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://www.cnn.com");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.cssSelector("#nav-world")).click();
		driver.findElement(By.cssSelector("#nav-politics")).click();
	}
}
