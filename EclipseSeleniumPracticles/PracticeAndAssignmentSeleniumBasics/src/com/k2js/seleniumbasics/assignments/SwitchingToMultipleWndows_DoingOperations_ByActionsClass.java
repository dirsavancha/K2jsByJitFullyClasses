package com.k2js.seleniumbasics.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingToMultipleWndows_DoingOperations_ByActionsClass {
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
		wait.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		WebElement foo = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='w3-example']/following-sibling::p/../div[3]/a")));
		foo.click();

		Set<String> win2 = cd.getWindowHandles();
		ArrayList<String> arr2 = new ArrayList<>(win2);
		for (String ele2 : arr2) {
			Thread.sleep(5000);
			cd.switchTo().window(ele2);
		}
		String main_win = arr2.get(0);
		cd.switchTo().window(main_win);
		System.out.println("PArent window is " + cd.getTitle());
		Thread.sleep(5000);

		String first_child_win = arr2.get(1);
		cd.switchTo().window(first_child_win);
		System.out.println("First Child Window is " + cd.getTitle());
		Thread.sleep(5000);
		String second_child_win = arr2.get(2);
		cd.switchTo().window(second_child_win);
		System.out.println("Second child window is " + cd.getTitle());
		
		cd.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		// Find the text less than five char in country column and find the Company names
		
			List <WebElement> coloumns=cd.findElements(By.xpath("//table/tbody/tr/th"));
			
			int coloumns_size=coloumns.size();
			List<WebElement> rows=cd.findElements(By.xpath("//tbody/tr"));
			int rows_size=rows.size();
			
			Map<String,String>hm=new HashMap<>();
			
			for(int i=2;i<=rows_size;i++) {
				WebElement country=cd.findElement(By.xpath("//tbody/tr["+i+"]/td[3]"));
				String country_text=country.getText();
				WebElement company=cd.findElement(By.xpath("//tbody/tr["+i+"]/td[1]"));
				String company_text=company.getText();
				
				if(country_text.length()<6) {
					hm.put(company_text, country_text);
				}
			}System.out.println(hm);
	}

}
