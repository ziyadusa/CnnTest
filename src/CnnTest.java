import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CnnTest {
	WebDriver driver = null;
	
    @Before
	public void setUp() throws Exception {
		//driver = new FirefoxDriver();
    	System.setProperty("webdriver.chrome.driver", "C://Selenium//Chrome//chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.cnn.com");
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	public void test() throws InterruptedException {
	    clickOnCss("#nav-world");
	    clickOnCss("#nav-politics");
	   // clickOnCss("#nav-video");
	    //clickOnCss("#nav-trends");
	    clickOnCss("#nav-us");
	    //clickOnCss(".cnn_bulletbin>li>a");
	    
	    //clickOnCss("#nav-world");
	    //clickOnCss("#nav-justice");
	    clickOnCss("#nav-entertainment");
	    clickOnCss(".cnn_bulletbin>li>a");
	    //clickOnCss("#nav-money");
	    //clickOnCss(".cnn-gallery.cnnProfile");
	    
		//driver.findElement(By.cssSelector("#nav-world")).click();
		//driver.findElement(By.cssSelector("#nav-politics")).click();
		//driver.findElement(By.cssSelector("#hdr-search-box")).sendKeys("politics");
		//driver.findElement(By.cssSelector(".ftr-search-sicon>input")).click();
		Thread.sleep(2000);
		
	}
	
	//helper method
	public void clickOnCss(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
			
		}
	}

