package com.k2js.seleniumbasics.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGeckoBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTrainingByJitendra\\"
				+ "Tools\\Selenium 3.141.59\\geckodriver.exe");
		
	
		WebDriver fd=new FirefoxDriver();
		
		fd.close();
		
	}

}
