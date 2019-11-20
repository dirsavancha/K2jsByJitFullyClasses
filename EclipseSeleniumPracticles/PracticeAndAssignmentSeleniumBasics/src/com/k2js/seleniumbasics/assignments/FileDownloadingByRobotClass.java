package com.k2js.seleniumbasics.assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloadingByRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		ChromeOptions co = new ChromeOptions();

		co.addArguments("user-data-dir=C:\\Users\\Gayathri\\AppData\\Local\\Google\\Chrome\\User Data\\Default");

		ChromeDriver cd = new ChromeDriver(co);

		cd.get("https://www.seleniumhq.org/download");
		cd.manage().window().maximize();
		WebElement ele = cd.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']"));
		ele.click();

		Robot rb = new Robot();
		rb.setAutoDelay(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}
