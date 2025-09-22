package NG_MA_SE_Jenkins.Jenkins.com;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTets extends BaseFix
{

    public CartTets() {
    }
	 @BeforeMethod
	    public void loginFirst() {
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;  
	 }
	 
@Test
public void addItemsToCart()
{
driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
driver.findElement(By.className("shopping_cart_link")).click();
//driver.findElement(By.id("remove-sauce-labs-backpack")).click();

int items = driver.findElements(By.className("cart_item")).size();
AssertJUnit.assertEquals(items, 1);
}

@Test
public void removeItemsFromCart() {
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    driver.findElement(By.className("shopping_cart_link")).click();
    driver.findElement(By.id("remove-sauce-labs-backpack")).click();

    int items = driver.findElements(By.className("cart_item")).size();
    AssertJUnit.assertEquals(items, 0);
}
}
