// Switching a frame by WebElement parameter
package com.k2js.seleniumbasics.switchframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameUsingWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();

		WebElement frame_ele = cd.findElement(By.id("iframeResult"));
		// Passing the webElement as argument to frame
		cd.switchTo().frame(frame_ele);

		WebElement tryit_button = cd.findElement(By.xpath("//button[@onclick='myFunction()']"));
		tryit_button.click();

	}

}
