package com.rk.practice.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableonBSEOilGas {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/oilgas");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement> clm = driver.findElements(By.xpath("//table/thead/tr/th"));
		int size_clm = clm.size();
		System.out.println("Coloumn Size is" + size_clm);

	 	List<WebElement> rw = driver.findElements(By.xpath("//table/thead/following-sibling::tbody/tr"));
		int size_rw = rw.size();
		System.out.println("Rows Size is" + size_rw);
		Map<String, String> mp = new HashMap<>();
		for (int i = 1; i <= size_rw; i++) {
			WebElement current_price = driver
					.findElement(By.xpath("//table/thead/following-sibling::tbody/tr["+i+"]/td[3]"));
			String current_price_text = current_price.getText();
			float f=Float.parseFloat(current_price_text);
			WebElement company = driver
					.findElement(By.xpath("//table/thead/following-sibling::tbody/tr["+i+"]/td[1]"));
			String company_text = company.getText();
			
			if (f<200) {
				mp.put(company_text, current_price_text);
			}

		}
		System.out.println(mp);
	}

}
