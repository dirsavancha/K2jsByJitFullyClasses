package com.k2js.PracticeAndAssignmentsofSeleniumWithMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static WebDriver cd;
	public static FileInputStream loginPage;

	public static void main(String[] args) throws IOException {

		// Properties file

		Properties prop = new Properties();

		loginPage = new FileInputStream(
				"D:\\SeleniumTrainingByJitendra\\Practicles\\EclipseSeleniumPracticles\\"
						+ "PracticeAndAssignmentsofSeleniumWithMaven\\TestData\\LoginDetails");
		prop.load(loginPage);

		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			cd = new ChromeDriver();

		} else {
			System.out.println("Chrome is not available");
		}
		cd.get(prop.getProperty("url"));
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		cd.findElement(By.xpath("//input[@name='userName']")).sendKeys(prop.getProperty("username"));
		cd.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		cd.findElement(By.name("login")).click();

	}

}
