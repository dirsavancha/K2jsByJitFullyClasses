package com.k2js.seleniumbasics.windowhandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingToMultipleWindowsFindLastWindowTitle {
	private static WebElement search_element, search_element_input, ele_HTML_Table, try_it_yourself;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();

		String parent = cd.getWindowHandle();
		// Webelment for the search icon and click
		search_element = cd.findElement(By.xpath("//a[@title='Search W3Schools']/i[@class='fa']"));
		search_element.click();

		// WebElement and operation for Search Box
		search_element_input = cd.findElement(By.id("gsc-i-id1"));
		search_element_input.click();
		search_element_input.clear();
		search_element_input.sendKeys("Table");

		Actions ac = new Actions(cd);
		Action mousemove_to_Search_Box = ac.moveToElement(search_element_input).build();
		ac.perform();

		ac.sendKeys(Keys.ENTER).perform();

		ele_HTML_Table = cd.findElement(By.xpath(
				"//a[@href='https://www.w3schools.com/html/html_tables.asp']/../../following-sibling::div/../div/div/a"));
		ele_HTML_Table.click();

		Set<String> win = cd.getWindowHandles();
		ArrayList<String> arr = new ArrayList<>(win);
		for (String all_win : arr) {
			cd.switchTo().window(all_win);
		}
		WebDriverWait wait = new WebDriverWait(cd, 120);
		wait.pollingEvery(Duration.ofSeconds(2));
		WebElement foo = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='w3-example']/following-sibling::p/../div[3]/a")));
		foo.click();

		Set<String> sec_child_win = cd.getWindowHandles();
		ArrayList<String> arr2 = new ArrayList<>(sec_child_win);
		for (String child_win : arr2) {
			cd.switchTo().window(child_win);
		}
		// Switching to main window or 1st window
		String first_Window = arr2.get(0);
		cd.switchTo().window(first_Window);
		System.out.println(cd.getTitle());
		// Switching to child window or 2nd window
		String second_window = arr2.get(1);
		cd.switchTo().window(second_window);
		System.out.println(cd.getTitle());
		
		// Switching to 2nd child window or 3rd window
		
		String third_win=arr2.get(2);
		cd.switchTo().window(third_win);
		System.out.println(cd.getTitle());

	}

}
