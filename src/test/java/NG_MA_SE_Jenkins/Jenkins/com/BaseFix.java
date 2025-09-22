package NG_MA_SE_Jenkins.Jenkins.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseFix {

	
		public WebDriver driver;	
		@BeforeMethod
		public void SetUp()
		{
			driver = new FirefoxDriver();
			driver.get("https://www.saucedemo.com/inventory.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}

		@AfterMethod
		public void TearDown()
		{
		driver.quit();	
		}

}
