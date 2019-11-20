package com.rk.practice.radiobuttonscheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		WebElement image=driver.findElement(By.cssSelector("i[class=\"fb_logo img sp_ji5zj_uMwB- sx_bc4a1c\"]"));
		image.click();
		
		if(driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up")) {
			System.out.println("We Are t FaceBook HomePage");
		}else
			System.out.println("We Are not At FaceBook HomePage");
		
		
	}

}
