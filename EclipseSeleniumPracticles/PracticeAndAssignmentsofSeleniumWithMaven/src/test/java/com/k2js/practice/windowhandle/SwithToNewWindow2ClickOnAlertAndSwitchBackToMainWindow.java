package com.k2js.practice.windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwithToNewWindow2ClickOnAlertAndSwitchBackToMainWindow {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		cd.get("https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver");
		String parentWindow = cd.getWindowHandle();
		System.out.println("Parent window is "+cd.getTitle());
		WebElement titlelink = cd.findElement(
				By.xpath(" //a[contains(text(),'http://toolsqa.com/automation-practice-switch-windows/')]"));
		titlelink.click();

		Set<String> all_win = cd.getWindowHandles();
		List<String> child_win = new ArrayList<>(all_win);
		for (String ele : child_win) {
			cd.switchTo().window(ele);

		}System.out.println("Second window title is"+cd.getTitle());
		WebElement secondwin_link = cd
				.findElement(By.xpath("//strong[contains(text(),'Demo Website for Practice Automation')]"));
		secondwin_link.click();
		
		Set<String> all_windows=cd.getWindowHandles();
		ArrayList<String>arr2=new ArrayList<String>(all_windows);
		for(String ele2:arr2) {
			cd.switchTo().window(ele2);
			
		}System.out.println("Third window titile"+cd.getTitle());

	}

}
