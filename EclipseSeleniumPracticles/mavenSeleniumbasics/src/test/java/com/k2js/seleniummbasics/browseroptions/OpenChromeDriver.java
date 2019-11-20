// Open the Chrome Browser with out System.setProperty
package com.k2js.seleniummbasics.browseroptions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChromeDriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();

	}

}
