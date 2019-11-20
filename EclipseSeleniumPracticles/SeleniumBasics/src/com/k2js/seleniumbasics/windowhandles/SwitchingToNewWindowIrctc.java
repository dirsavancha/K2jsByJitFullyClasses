package com.k2js.seleniumbasics.windowhandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToNewWindowIrctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.irctc.co.in/nget/train-search");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 WebElement flights=cd.findElement(By.linkText("FLIGHTS"));
		 flights.click();
		 System.out.println(cd.getTitle());
		 Set<String>allwindows=cd.getWindowHandles();
		 List<String>allwins=new ArrayList<>(allwindows);
		 String mw=allwins.get(0);
		 String cw=allwins.get(1);
		 cd.switchTo().window(cw);
		 System.out.println(cd.getTitle());
		 WebElement oneway_radibutton=cd.findElement(By.xpath("//label[contains(text(),'One Way')]"));
		  boolean check_radibutton =oneway_radibutton.isSelected();
		  System.out.println(check_radibutton);
		  cd.switchTo().window(mw);
		  cd.close();
	}

}
