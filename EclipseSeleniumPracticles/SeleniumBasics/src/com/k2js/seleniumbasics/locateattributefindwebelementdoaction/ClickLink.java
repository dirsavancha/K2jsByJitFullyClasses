package com.k2js.seleniumbasics.locateattributefindwebelementdoaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\" + "Tools\\Selenium 3.141.59\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com");
		cd.manage().window().maximize();

		By loc_reg_link = By.linkText("REGISTER");

		WebElement ele_reg_link = cd.findElement(loc_reg_link);
		ele_reg_link.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cd.close();
	}	

}
