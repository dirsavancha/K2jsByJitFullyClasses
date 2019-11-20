package com.k2js.seleniumbasics.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\SeleniumTrainingByJitendra\\Tools"
				+ "\\Selenium 3.141.59\\IEDriverServer.exe");
		WebDriver ie=new InternetExplorerDriver();
		ie.close();
	}

}
