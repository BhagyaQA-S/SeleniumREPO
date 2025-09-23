package NG_MA_SE_Jenkins.Jenkins.com;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInZig extends BaseFix
{
	@Test(priority = 1)
	public void validLogin()
	{
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	
	String title = driver.findElement(By.className("title")).getText();
	AssertJUnit.assertEquals(title, "Products");
	}

	// Test case for invalid password
	/*@Test(priority = 2)
	public void invalidLogin()
	{
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("wrong");
	    driver.findElement(By.id("password")).sendKeys("wrong");
	    driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
	
	String error = driver.findElement(By.className("h3[data-test='error']")).getText();
	AssertJUnit.assertTrue(error.contains("Username and password do not match"));
	}*/
}


