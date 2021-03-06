package com.rk.apsrtcframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	

	@FindBy(xpath = "//a[@class='user']")
	private WebElement eticketlogin;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageTitile() {
		return driver.getTitle();
	}

	public LoginPage clickOn_eTicket_LoginButton() {
		eticketlogin.click();
		return PageFactory.initElements(driver, LoginPage.class);

	}

}
