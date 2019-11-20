package com.k2js.seleniumbasics.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToPopup_ReadText_ClickOk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		cd.switchTo().frame(1);
		
		WebElement tryit_button = cd.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		tryit_button.click();

		Alert al = cd.switchTo().alert();
		String alert_text=cd.switchTo().alert().getText();
		System.out.println(alert_text);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al.accept();

	}

}
