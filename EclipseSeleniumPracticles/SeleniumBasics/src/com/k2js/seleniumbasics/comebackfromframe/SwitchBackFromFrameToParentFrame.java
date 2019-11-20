package com.k2js.seleniumbasics.comebackfromframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBackFromFrameToParentFrame {

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
		cd.switchTo().parentFrame();
		cd.findElement(By.xpath("//button[contains(text(),'Run')]")).click();
		//conforming wether it click on run or not,
		//so her once it click on run the text which is in frame is disable. 
		String expected="";
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement frame_txt_ele = cd.findElement(By.id("demo"));
		String frame_text_ele = frame_txt_ele.getText();
		assert expected.equalsIgnoreCase(frame_text_ele):"Both are not same";
		System.out.println("completed");
		
		// Here we get NoSuchElementException because when we click on run and the display message in frame will be disable
		
	}

}
