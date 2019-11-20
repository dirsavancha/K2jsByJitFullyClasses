package com.k2js.mavenSeleniumbasics.autoit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenAlwaysChromeBrowserAutoItExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("C:\\Users\\Gayathri\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		ChromeDriver cd=new ChromeDriver(co);
	}

}
