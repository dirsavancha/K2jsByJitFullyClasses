package com.k2js.seleniumbasics.explicitwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterLinkForAjaxElement_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com");

		cd.manage().window().maximize();
		FluentWait<WebDriver> fw=new WebDriverWait(cd,50); // upcasted
		
		//fw.withTimeout(Duration.ofSeconds(50));
		fw.pollingEvery(Duration.ofSeconds(5));
		WebElement regLink=fw.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("REGISTER")));
		regLink.click();
		cd.close();
	}

}
