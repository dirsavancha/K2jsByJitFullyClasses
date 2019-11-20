package com.k2js.seleniumbasics.switchframes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwithToFrameUsingWait_SwitchToItByWebElement {

	@FindBy(name="iframeResult") 
	private  WebElement tryit_button;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cd.manage().window().maximize();
SwithToFrameUsingWait_SwitchToItByWebElement web_ele=PageFactory.initElements(cd,SwithToFrameUsingWait_SwitchToItByWebElement.class);
		WebDriverWait fw = new WebDriverWait(cd, 50);

		fw.pollingEvery(Duration.ofSeconds(5));
		 fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(web_ele.tryit_button));

		WebElement tryit_button = cd.findElement(By.xpath("//button[@onclick='myFunction()']"));
		tryit_button.click();
	}
}