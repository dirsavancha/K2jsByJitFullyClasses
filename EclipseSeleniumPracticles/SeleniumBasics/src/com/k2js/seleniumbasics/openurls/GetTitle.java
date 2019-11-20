package com.k2js.seleniumbasics.openurls;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumTrainingByJitendra"
				+ "/Tools/Selenium 3.141.59/chromedriver.exe");
		
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com");
		System.out.println(cd.getTitle());
		
	}

}
