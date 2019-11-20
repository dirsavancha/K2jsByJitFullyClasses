package com.k2js.seleniumbasics.assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadByRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		FirefoxDriver fd=new FirefoxDriver();

		fd.get("https://gofile.io/?t=uploadFiles");
		fd.manage().window().maximize();
		WebElement ele = fd.findElement(By.id("btnChooseFiles"));
		ele.click();
String file_Path="C://Users//Gayathri//Desktop//Screenshot.png/";
		  StringSelection stringSelection = new StringSelection(file_Path);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Robot rb = new Robot();
		rb.setAutoDelay(3000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}
