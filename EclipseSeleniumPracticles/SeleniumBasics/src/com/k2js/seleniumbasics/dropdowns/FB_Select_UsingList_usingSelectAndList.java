package com.k2js.seleniumbasics.dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Select_UsingList_usingSelectAndList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\" + "Tools\\Selenium 3.141.59\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement datedropdownlist = cd.findElement(By.xpath("//select[@id='day']"));

		Select alldates = new Select(datedropdownlist);
		List<WebElement> datelist = alldates.getOptions();
		// enhanced forloop
		for (WebElement ele : datelist) {
			if (ele.getText().equalsIgnoreCase("20")) {
				ele.click();
				break;
			}
		}
		// Normal Forloop
		for (int i = 0; i < datelist.size(); i++) {
			WebElement ele = datelist.get(i);
			if (ele.getText().equalsIgnoreCase("22")) {
				ele.click();
				break;
			}

		}
		// Using Lambda Expression
		datelist.stream().filter(x -> x.getText().equals("27")).forEach(x -> x.click());

	}
}
