package com.k2js.seleniumbasics.comebackfromframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchBackFromFrameToParentFrameUsingWindowHandle {

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
		System.out.println(al.getText());
		al.accept();
		String win_handle=cd.getWindowHandle();
		cd.switchTo().window(win_handle);
		cd.findElement(By.xpath("//button[contains(text(),'Run')]")).click();
		//conforming wether it click on run or not,
		//so her once it click on run the text which is in frame is disable. 
		String expected="";
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cd.switchTo().frame(1);
		WebElement frame_txt_ele = cd.findElement(By.id("demo"));
		String frame_text_ele = frame_txt_ele.getText();
		System.out.println(frame_text_ele);
		assert expected.equalsIgnoreCase(frame_text_ele):"Both are not same";
		System.out.println("completed");
		
		
	}

}
