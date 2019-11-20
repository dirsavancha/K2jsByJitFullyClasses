//DropDown using List..

package com.rk.practice.dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingWithList {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement> select_drp = driver.findElements(By.xpath("//select[@name='categories']/option"));
		//select_drp.stream().filter(x->x.getText().equalsIgnoreCase("MARKETING")).forEach(x->x.click());
		for (WebElement ele : select_drp) {

			if (ele.getText().equalsIgnoreCase("MARKETING")) {
				ele.click();
				break;
			}

		}
	}

}
