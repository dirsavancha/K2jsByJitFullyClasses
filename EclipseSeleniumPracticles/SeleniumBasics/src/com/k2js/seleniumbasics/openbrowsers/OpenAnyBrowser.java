package com.k2js.seleniumbasics.openbrowsers;

import org.openqa.selenium.WebDriver;

public class OpenAnyBrowser {

	public static void main(String...abc) {
		String bn = abc[0];
		String rm = abc[1];

		WebDriver driver = BrowserFactory.getBrowser(bn, rm);

		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}

}
