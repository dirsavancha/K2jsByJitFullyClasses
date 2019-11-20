package com.rk.practice.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingTotalSizeOfColoumsnsAndRowsinTable {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rows_size=rows.size();
		String first_half_rows="//table[@id='customers']//tr[";
		String second_hlf_rows="]/td[1]";
		
		for(int i=2;i<=rows_size;i++) {
			String actualPath=first_half_rows+i+second_hlf_rows;
			WebElement element=driver.findElement(By.xpath(actualPath));
			
		}
				
	}

}
