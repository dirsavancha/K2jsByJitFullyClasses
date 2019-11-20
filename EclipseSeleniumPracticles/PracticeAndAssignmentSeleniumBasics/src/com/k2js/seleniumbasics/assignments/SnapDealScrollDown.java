package com.k2js.seleniumbasics.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDealScrollDown {
	static ChromeDriver cd;
	private static WebElement capacity_128GB, capacity_1TB, total_Capacity;
	WebDriverWait wait;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");
		cd = new ChromeDriver();
		cd.get("https://www.snapdeal.com");

		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//a/span[contains(text(),'Computers & Gaming')]")).click();

		cd.findElement(By.xpath("//a/span[@class='headingText'][contains(text(),'Storage')]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JavascriptExecutor jse = (JavascriptExecutor) cd;
		jse.executeScript("window.scrollBy(0,3000)");

		WebDriverWait wait = new WebDriverWait(cd, 90);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//div[@class='filter-content ']/button[@class='view-more-button btn btn-line btn-theme-secondary viewMoreFilter']"
						+ "[contains(@data-filtername,'Capacity_s')]")))
				.click();
		try {

			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		capacity_128GB = cd.findElement(By.xpath(
				"//div[@class='filter-inner overflow-filter']/div[@class='filters-list sdCheckbox  ']/label[@for=\"Capacity_s-128 GB\"]"));
		capacity_128GB.click();

		jse.executeScript("window.scrollBy(0,200)");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		capacity_1TB = cd.findElement(By.xpath(
				"//div[@class='filter-inner filter-inner-height']/div[@class='filters-list sdCheckbox  ']/label[@for='Capacity_s-1 TB']"));
		capacity_1TB.click();
		total_Capacity = cd
				.findElement(By.xpath("//div[@class='filters-top-selected']/div/div[@class='navFiltersPill']/a"));

	}

}
