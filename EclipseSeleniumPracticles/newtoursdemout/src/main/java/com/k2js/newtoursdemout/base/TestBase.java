package com.k2js.newtoursdemout.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.ltgfmt.impl.TestCaseImpl.FilesImpl;
import org.openqa.selenium.WebDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
	public TestBase() throws IOException {
		prop=new Properties();
		fis=new FileInputStream("D:\\SeleniumTrainingByJitendra\\Practicles\\EclipseSeleniumPracticles"
				+ "\\newtoursdemout\\src\\main\\java\\com\\k2js\\newtoursdemout\\config\\Config.Properties");
		prop.load(fis);
		
	}
	

}
