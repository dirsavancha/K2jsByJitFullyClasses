package com.k2js.seleniumbasics.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNthLargestValueInYahooText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.yahoo.com");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		cd.findElement(By.id("uh-search-box")).sendKeys("Testing");
		List<WebElement> list_searchkeys = cd
				.findElementsByXPath("//ul[@role='listbox']/li[@class='yui3-aclist-item']");
		int totalSize = list_searchkeys.size();
		System.out.println(totalSize);

		List<String> texts = list_searchkeys.stream().map(WebElement::getText).collect(Collectors.toList());

		System.out.println(texts);
		String largestValue = texts.get(0);

		for (String ele : texts) {
			if (ele.length() > largestValue.length()) {
				largestValue = ele;

			}

		}
		System.out.println("Largest Value among all is " + largestValue);

		// using enhanced forloop
		/*
		 * for (String element : texts) { if (element.length() > largestValue.length())
		 * { largestValue = element;
		 * 
		 * } } System.out.println("Longest Value is " + largestValue);
		 */

		cd.close();

	}
}
