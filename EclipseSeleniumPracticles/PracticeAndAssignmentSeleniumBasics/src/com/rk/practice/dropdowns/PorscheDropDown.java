package com.rk.practice.dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PorscheDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.porsche.com/usa/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement> list_ele = driver.findElements(By.xpath(
				"//div[@class=\"m-101__menuitems-wrapper m-101__menuitems-wrapper--desktop\"]/div[@role=\"link\"]/nav[@class=\"m-101__navigation\"]/div[@class=\"m-101__menu\"]/div"));
		WebElement panerama = driver.findElement(By.xpath(
				"//div[@class=\"m-101__menuitems-wrapper m-101__menuitems-wrapper--desktop\"]/div[@role=\"link\"]/nav[@class=\"m-101__navigation\"]/div[@class=\"m-101__menu\"]/div[@data-carrange='panamera']"));
		panerama.click();

	}

}
