package com.k2js.seleniumbasics.mousekeyboardactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SwithingAndUsingDropdownswithKeyboardAndClickWithMouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.irctc.co.in/nget/train-search");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		Actions actions = new Actions(cd);
		WebElement trains_ele=cd.findElement(By.xpath("//a[contains(text(),'TRAINS')]"));
		Action mousemove=actions.moveToElement(trains_ele).build();
		mousemove.perform();// mouse Action
		/*
		 * actions.sendKeys(Keys.DOWN).perform(); actions.sendKeys(Keys.DOWN).perform();// Keyboard action
		 * actions.sendKeys(Keys.DOWN).perform(); actions.sendKeys(Keys.DOWN).perform();
		 * actions.sendKeys(Keys.DOWN).perform(); actions.sendKeys(Keys.DOWN).perform();
		 */
		for(int i=0;i<=5;i++) {
			actions.sendKeys(Keys.DOWN).perform();
		}
		
		
	}

}
