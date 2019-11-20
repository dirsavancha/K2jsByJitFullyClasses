package com.rk.apsrtcframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "userName")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement pswd;
	
	@FindBy(id="submitBtn")
	private WebElement loginButton;

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String uname) {
		username.clear();
		username.sendKeys(uname);
	}
	
	public void enterPasswor(String pwd) {
		pswd.clear();
		pswd.sendKeys(pwd);
	}
	public ReservationPage clickOnLoginButton() {
		loginButton.click();
		return PageFactory.initElements(driver, ReservationPage.class);
	}

}
