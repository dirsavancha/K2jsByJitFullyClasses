package com.k2js.seleniumbasics.openbrowsers;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {

	private static WebDriver driver = null;

	public static WebDriver getBrowser(String browserName, String runMode) {

		if (runMode.equals("local")) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\chromedriver.exe");

				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools\\Selenium 3.141.59\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools" + "\\Selenium 3.141.59\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}
		} else if (runMode.equalsIgnoreCase("remote")) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				ChromeOptions co = new ChromeOptions();
				try {
					driver = new RemoteWebDriver(new URL(""), co);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		return driver;

	}

}
