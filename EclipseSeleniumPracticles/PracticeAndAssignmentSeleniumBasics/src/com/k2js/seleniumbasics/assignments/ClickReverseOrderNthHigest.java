package com.k2js.seleniumbasics.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickReverseOrderNthHigest {
	static ChromeDriver cd;

	@FindBy(xpath = "//tr[@class='mouseOut']")
	private List<WebElement> list;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");
		cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com");
		cd.manage().window().maximize();
		List<WebElement> list = cd.findElements(By.xpath("//tr[@class='mouseOut']"));

		int sizeOfAllLinks = list.size();

		System.out.println(sizeOfAllLinks);

		ClickReverseOrder cro = PageFactory.initElements(cd, ClickReverseOrder.class);
		WebElement[] allele = cro.list.toArray(new WebElement[0]);
		Arrays.parallelSort(allele, (x, y) -> y.getText().length() - x.getText().length());
		Arrays.stream(allele).forEach(x -> System.out.println(x.getText()));
		allele[0].click();

		cd.close();
	}

}
