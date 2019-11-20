package com.k2js.seleniumbasics.dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Select_UsingList_Lambda {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\" + "Tools\\Selenium 3.141.59\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		List<WebElement> datedropdownlist = cd.findElementsByXPath("//select[@id='day']/option");
		datedropdownlist.stream().filter(x -> x.getText().equals("18")).forEach(x -> x.click());
	}

}
