// Autoit

package com.k2js.seleniummbasics.browseroptions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenSameChromeBrowser {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("user-data-dir=C:\\Users\\Gayathri\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		ChromeDriver cd = new ChromeDriver(co);
		cd.get("https://www.seleniumhq.org/download");
		cd.manage().window().maximize();
		WebElement ele = cd.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']"));
		ele.click();
		try {
			Runtime.getRuntime().exec("D:\\SeleniumTrainingByJitendra\\Notes\\AutoitExample.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
