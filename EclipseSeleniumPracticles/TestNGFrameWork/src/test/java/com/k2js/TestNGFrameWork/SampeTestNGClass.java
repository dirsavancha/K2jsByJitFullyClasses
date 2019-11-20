package com.k2js.TestNGFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampeTestNGClass {
	public static String baseurl="http://newtours.demoaut.com";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void verifyHomePageTtitle() {
		String excpectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, excpectedTitle);
	}
	@AfterTest
	public void teatDown() {
		driver.quit();
	}


}
