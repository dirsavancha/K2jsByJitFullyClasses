package com.k2js.seleniumbasics.windowhandles;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitichToNewWindowAndComeBackToParentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.irctc.co.in/nget/train-search");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		WebElement flights_click = cd.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]"));
		flights_click.click();
		Set<String> allwin = cd.getWindowHandles();
		ArrayList<String> allwindows = new ArrayList<>(allwin);
		 cd.switchTo().window(allwindows.get(1));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  WebElement oneway_radibutton=cd.findElement(By.id("One-Way"));
		  //oneway_radibutton.click();
		  boolean check_radibutton =oneway_radibutton.isSelected();
		  System.out.println(check_radibutton);
		  
		/*
		 * assert oneway_radibutton.isSelected():"Is not selected";
		 * System.out.println("completed");
		 */
		  cd.close();
	}

}
