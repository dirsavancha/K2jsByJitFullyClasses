package com.rk.practice.dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingWithListAndSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement select_drp = driver.findElement(By.xpath("//select[@name='categories']"));
		Select sel=new Select(select_drp);
		List<WebElement>list_ele=sel.getOptions();
		for (WebElement ele : list_ele) {
			System.out.println(ele.getText());

			if (ele.getText().equalsIgnoreCase("MARKETING")) {
				ele.click();
				break;
			}

		}
	}

}
