package com.k2js.seleniumbasics.windowhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingSameWindow {

	public static void main(String[] args) throws Exception {
		WebDriver cd;
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");
		cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com");
		cd.manage().window().maximize();
		WebElement register=cd.findElement(By.linkText("REGISTER"));
		register.click();
		Thread.sleep(5000);
		WebElement firstname=cd.findElement(By.name("firstName"));
		firstname.click();
		firstname.sendKeys("Keys");
		Thread.sleep(5000);
		firstname.clear();
		Thread.sleep(5000);
		firstname.sendKeys("Keys 2 Java");
	}

}
