package com.k2js.seleniumbasics.assignments;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickReverseOrder {
	static ChromeDriver cd;

	@FindBy(xpath = "//tr[@class='mouseOut']")
	List<WebElement> list;

	/*
	 * public static WebElement getElementWithIndex(int position) { List<WebElement>
	 * list = cd.findElements(By.xpath("//tr[@class='mouseOut']")); return
	 * list.get(position); }
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");
		cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com");
		cd.manage().window().maximize();
		List<WebElement> list = cd.findElements(By.xpath("//tr[@class='mouseOut']"));

		//Collections.reverse(list);
		int sizeOfAllLinks = list.size();
		System.out.println(sizeOfAllLinks);

		for (int i = 0; i < sizeOfAllLinks; i++) {
			System.out.println(list.get(i).getText());
		}

		ClickReverseOrder cro = PageFactory.initElements(cd, ClickReverseOrder.class);
		for (int i = sizeOfAllLinks - 1; i > 0; i--) {
			// getElementWithIndex(i).click();
			cro.list.get(i).click();
		}
		cd.close();

	}

}
