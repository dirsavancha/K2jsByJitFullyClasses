package com.k2js.seleniumbasics.comebackfromframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComeBackFromFrameUsingDefaultcontent {
	private static WebElement tryit_button, run_ele, switch_toFrame_ele, try_it_ele_text;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		cd.switchTo().frame(1);
		try {
			Thread.sleep(5000);
			tryit_button = cd.findElement(By.xpath("//button[contains(text(),'Try it')]"));
			tryit_button.click();
			Alert al = cd.switchTo().alert();
			System.out.println(al.getText());
			al.accept();

			cd.switchTo().defaultContent();
			Thread.sleep(5000);
			WebElement run_ele = cd.findElement(By.xpath("//button[contains(text(),'Run')]"));
			run_ele.click();
		
		// Finding the text is displayed or not in the frame once when we click run
		// button
			
		switch_toFrame_ele = cd.findElement(By.id("iframeResult"));
		
		cd.switchTo().frame(switch_toFrame_ele);// Switiching to frame by an webelement
		
			
		Thread.sleep(5000);
		String expected="";
		try_it_ele_text = cd.findElement(By.xpath("//p[@id='demo']"));
		String text_res = try_it_ele_text.getText();

		assert expected.equalsIgnoreCase(text_res) : "Both text are not suitable"; // text is empty so it should pass

		System.out.println("completed");
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}

	}

}
