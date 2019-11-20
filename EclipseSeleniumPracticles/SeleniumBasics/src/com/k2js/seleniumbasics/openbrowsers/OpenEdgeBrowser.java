package com.k2js.seleniumbasics.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\MicrosoftWebDriver.exe");
		
		WebDriver edge=new EdgeDriver();
		
		edge.close();
		
	}

}
