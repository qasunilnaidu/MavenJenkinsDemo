package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browserlaunch {
	
	@Test
	public static void launchBrowser()
	{
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
	}
	

}
