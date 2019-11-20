package com.k2js.seleniumbasics.resizewindow;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools" + "\\Selenium 3.141.59\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();

		cd.get("https://www.facebook.com");
		cd.manage().window().maximize();

		Dimension dim = new Dimension(500, 1000);
		cd.manage().window().setSize(dim);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// cd.close();

	}

}
