package com.rk.practice.seleniumexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_By_Noukari {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.naukri.com");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
		String parent_window = cd.getWindowHandle();
		Thread.sleep(5000);
		WebElement jobs_ele = cd.findElement(By.xpath("//a[@title=\"Search Jobs\"]/div[contains(text(),'Jobs')]"));
		jobs_ele.click();

		Set<String> child_win = cd.getWindowHandles();
		List<String> arr1 = new ArrayList<>(child_win);

		for (String ele : arr1) {

		}
		String child1=arr1.get(1);
		cd.switchTo().window(child1);
		System.out.println("1st child window is "+cd.getTitle());
		cd.close();
		String child2=arr1.get(2);
		cd.switchTo().window(child2);
		System.out.println("2nd Child window is"+cd.getTitle());
		cd.close();
		String child3=arr1.get(3);
		cd.switchTo().window(child3);
		System.out.println("3rd child window is"+cd.getTitle());
		cd.close();
		
		cd.switchTo().window(parent_window);
		System.out.println("Parent window is"+cd.getTitle());
		Thread.sleep(5000);
		
		Set<String>popupwindow=cd.getWindowHandles();
		ArrayList<String> pop=new ArrayList<String>(popupwindow);
		for(String ele4:pop) {
			cd.switchTo().window(ele4);
			System.out.println(cd.getTitle());
		}
		// closing the extra pop up window
		cd.findElement(By.xpath("//span[contains(text(),'Later')]")).click();
		
		}

}
