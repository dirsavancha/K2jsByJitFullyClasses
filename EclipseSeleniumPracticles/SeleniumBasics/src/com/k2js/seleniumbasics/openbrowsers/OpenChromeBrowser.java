package com.k2js.seleniumbasics.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools"
				+ "\\Selenium 3.141.59\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.close();
	
	}

}
