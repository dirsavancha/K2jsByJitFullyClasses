// Selenium Grid
package com.k2js.seleniumbasics.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenRemoteChrome {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		RemoteWebDriver driver=null;
		
			try {
				driver=new RemoteWebDriver(new URL("http://192.168.0.103:4445/wd/hub"),co);
				driver.get("https://www.seleniumhq.org");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		 
		
	}

	

}
