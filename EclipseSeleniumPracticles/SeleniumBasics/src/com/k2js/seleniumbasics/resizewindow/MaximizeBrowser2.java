package com.k2js.seleniumbasics.resizewindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools" + "\\Selenium 3.141.59\\chromedriver.exe");

		WebDriver cd = new ChromeDriver();

		cd.get("https://www.facebook.com");
		cd.manage().window().maximize();
		//cd.close();

	}

}
