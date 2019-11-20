package com.k2js.mavenfinalfw.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConformationPage {
	
	@FindBy(xpath="//td/p[1]/font/../..")
	private WebElement conformationMessage;
	
	
	private WebDriver driver;
	public ConformationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getconformationtext() {
		System.out.println("This is before inside conformation text method");
		String cmsg=conformationMessage.getText();
		System.out.println("This is after inside cnformtion text ");
		return cmsg;
	}
	

}
