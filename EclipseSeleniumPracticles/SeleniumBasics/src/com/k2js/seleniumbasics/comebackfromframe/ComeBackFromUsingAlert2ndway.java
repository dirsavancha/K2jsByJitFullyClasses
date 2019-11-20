package com.k2js.seleniumbasics.comebackfromframe;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComeBackFromUsingAlert2ndway {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		cd.switchTo().frame(1);
		WebElement tryit_button = cd.findElement(By.xpath("//button[@onclick='myFunction()']"));
		tryit_button.click();
		/*
		 * Alert al = cd.switchTo().alert(); al.accept();
		 */
		WebDriverWait ww = new WebDriverWait(cd, 50);
		ww.pollingEvery(Duration.ofSeconds(5));
		Alert a = ww.until(ExpectedConditions.alertIsPresent());
		a.accept();
		

	}

}
