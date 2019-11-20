package com.k2js.seleniumbasics.explicitwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class RegisterLinkForAjaxElement {
   static ChromeDriver cd;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com");

		cd.manage().window().maximize();
		FluentWait<ChromeDriver> fw=new FluentWait<>(cd);
		
		fw.withTimeout(Duration.ofSeconds(50));
		fw.pollingEvery(Duration.ofSeconds(5));
	//	fw.ignoring(StaleElementReferenceException);
		WebElement regLink=fw.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("REGISTER")));
		regLink.click();
		

	}
}
