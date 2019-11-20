package com.k2js.practice.windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwithToNewWindow {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		cd.get("https://www.w3schools.com/java/java_getstarted.asp");
	}

}
