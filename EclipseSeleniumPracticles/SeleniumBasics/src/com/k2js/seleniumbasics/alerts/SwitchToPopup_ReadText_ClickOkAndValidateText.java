package com.k2js.seleniumbasics.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToPopup_ReadText_ClickOkAndValidateText {

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Alert al = cd.switchTo().alert();
		al.accept();
		String expected_frame_Titile = "You pressed OK!";
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement frame_txt_ele = cd.findElement(By.id("demo"));
		String frame_text_ele = frame_txt_ele.getText();

		assert expected_frame_Titile.equalsIgnoreCase(frame_text_ele) : "Both text are not same";
		System.out.println("completed");

	}

}
