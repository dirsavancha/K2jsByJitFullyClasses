package com.k2js.seleniumbasics.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomNumber {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\" + "Tools\\Selenium 3.141.59\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com");
		cd.manage().window().maximize();

		List<WebElement> list = cd.findElements(By.xpath("//tr[@class='mouseOut']"));

		System.out.println("List Size is " + list.size());

		int rand = (int) (Math.random() * list.size()) + 1;
		System.out.println("Random number is " + rand);

		System.out.println(rand + "th place is " + list.get(rand - 1).getText());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement ele = list.get(rand - 1);
		ele.click();

		cd.close();
	}

}
