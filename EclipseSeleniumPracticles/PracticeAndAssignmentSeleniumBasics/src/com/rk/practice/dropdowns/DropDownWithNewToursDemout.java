package com.rk.practice.dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithNewToursDemout {
	static WebDriver cd;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com/mercuryregister.php");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Thread.sleep(5000);

		/*
		 * WebElement country = cd.findElement(By.xpath("//select[@name='country']"));
		 * Select sel = new Select(country); sel.selectByVisibleText("INDIA");
		 */

		
		  WebElement cntry=cd.findElement(By.xpath("//select[@name='country']"));
		  Select sel=new Select(cntry); 
		  List<WebElement> ele=sel.getOptions();
		// Result not getting no error also  
		for(WebElement opt:ele) {
			if(opt.getText().equalsIgnoreCase("INDIA")) {
				opt.click();
				break;
			}
		}
		  
		 

	}

}
