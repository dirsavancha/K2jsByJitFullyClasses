package com.k2js.PracticeAndAssignmentsofSeleniumWithMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicFunctionalty {
	static WebDriver driver;
	static Properties prop_loginPage, prop_pageObjects;;
	static FileInputStream registerPage_Objects, loginPage;

	public static WebDriver setBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(prop_loginPage.getProperty("url"));

		return driver;

	}

	public static void readPropertiyFileswithFilePathReader() throws IOException {
		
		loginPage = new FileInputStream(
				"D:\\SeleniumTrainingByJitendra\\Practicles\\EclipseSeleniumPracticles\\PracticeAndAssignmentsofSeleniumWithMaven\\TestData\\LoginDetails");

		registerPage_Objects = new FileInputStream(
				"D:\\SeleniumTrainingByJitendra\\Practicles\\EclipseSeleniumPracticles\\PracticeAndAssignmentsofSeleniumWithMaven\\TestData\\Config.Properties");
		prop_loginPage = new Properties();
		prop_loginPage.load(loginPage);
		
		prop_pageObjects = new Properties();
		prop_pageObjects.load(registerPage_Objects);
	}

}
