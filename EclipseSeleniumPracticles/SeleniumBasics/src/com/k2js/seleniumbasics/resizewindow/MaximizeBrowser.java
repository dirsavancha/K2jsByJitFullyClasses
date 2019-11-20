package com.k2js.seleniumbasics.resizewindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools" + "\\Selenium 3.141.59\\chromedriver.exe");

		WebDriver cd = new ChromeDriver();

		cd.get("https://www.facebook.com");
		Options o = cd.manage();

		Window w = o.window();
		w.maximize();

	}

}
