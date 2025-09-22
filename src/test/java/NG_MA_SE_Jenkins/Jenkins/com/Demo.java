package NG_MA_SE_Jenkins.Jenkins.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
public void tryme()
{
ChromeDriver driever = new ChromeDriver();
System.out.println(driever.getTitle());
}
}
