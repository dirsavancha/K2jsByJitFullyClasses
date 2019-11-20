package com.k2js.seleniumbasics.openurls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_com {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools" + "\\Selenium 3.141.59\\chromedriver.exe");

		WebDriver cd = new ChromeDriver();

		cd.get("https://www.facebook.com");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cd.close();

	}

}
