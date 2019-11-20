package com.k2js.seleniumbasics.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGeoLocationPopups {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		WebElement icon = cd.findElement(By.xpath("//a[@title='Search W3Schools']/i[@class='fa']"));
		icon.click();

		WebElement search = cd.findElement(By.id("gs_tti50"));
		search.click();
		Thread.sleep(5000);
		search.sendKeys("geo");
		Thread.sleep(5000);
		cd.findElement(By.xpath("//div[@class=\"gs-title\"]/a[contains(text(),'HTML5 Geolocation')]")).click();
		
		WebElement clickOnSearchButton=cd.findElement(By.xpath("//button[@class=\"gsc-search-button gsc-search-button-v2\"]"));
		clickOnSearchButton.click();
	}

}
