package com.k2js.seleniumbasics.windowhandles;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToNewWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.irctc.co.in/nget/train-search");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		 WebElement flights_click=cd.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]"));
		 flights_click.click();
		 Set<String>allwin=cd.getWindowHandles();
		 for(String ele:allwin) {
			 cd.switchTo().window(ele);
			 System.out.println(cd.getTitle() );
		 }
		 ArrayList<String>allwindows=new ArrayList<>(allwin);
		 cd.switchTo().window(allwindows.get(1));
		 System.out.println("2nd window page titile is"+cd.getTitle());
		 cd.switchTo().window(allwindows.get(0));
		 System.out.println("1st parent window page title is"+cd.getTitle());
		 
	}

}
