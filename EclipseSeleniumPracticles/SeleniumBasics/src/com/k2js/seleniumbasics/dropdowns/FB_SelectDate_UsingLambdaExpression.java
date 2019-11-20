package com.k2js.seleniumbasics.dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_SelectDate_UsingLambdaExpression {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\" + "Tools\\Selenium 3.141.59\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement yeardropdown = cd.findElement(By.id("year"));
		Select selectyear = new Select(yeardropdown);
		selectyear.getOptions().stream().filter(x -> x.getText().equals("1906")).forEach(x -> x.click());
	}

}
