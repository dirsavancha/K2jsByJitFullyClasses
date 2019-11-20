package com.k2js.seleniumbasics.locateattributefindwebelementdoaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLink4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();

		cd.get("http://newtours.demoaut.com");
		cd.manage().window().maximize();
		WebElement rl = cd.findElement(By.linkText("REGISTER"));
		rl.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement r2 = cd.findElement(By.name("firstName"));
		r2.click();
		r2.sendKeys("Rama");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement r3=cd.findElement(By.name("register"));
		r3.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//WebElement r4=cd.findElement(By.xpath("//tr[3]/td/p[2]/font[@face='Arial, Helvetica, sans-serif']"));
		WebElement r4=cd.findElement(By.xpath("//table/tbody/tr[3]/td/p[2]/.."));
		r4.click();
		System.out.println(r4.getText());
		cd.close();
		

	}

}
