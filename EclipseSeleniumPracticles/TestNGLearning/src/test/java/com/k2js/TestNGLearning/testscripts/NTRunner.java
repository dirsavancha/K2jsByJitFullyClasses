package com.k2js.TestNGLearning.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NTRunner {
	String bn, rm, url;

	@Parameters({ "bname", "rmode" })
	@BeforeTest
	public void readxml(@Optional("chrome") String b, @Optional("local")String r) {
		this.bn = b;
		this.rm = r;
		System.out.println(this.bn);
		System.out.println(this.rm);
	}

	public void readData() {
		System.out.println("Read Browser from config.properties");
		System.out.println("Read Run mode from config.properties");
		System.out.println("Read url from config.properties");
	}

	@BeforeMethod(groups={"high"})
	public void preCondition() {

		System.out.println("Test case Started");
		System.out.println("Open browser");
		System.out.println("Open url");

	}

	@Test(groups= {"high"})
	public void verifyHomePageTitle() {

		System.out.println("Get Actual Title");
		System.out.println("Get Expected Titile");
		System.out.println("Validate Title");

	}

	@Test(groups= {"medium"})
	public void verifyConformatonMessage() {

		System.out.println("Click on Register Link");
		System.out.println("Enter the First Name");
		System.out.println("Enter Last Name");
		System.out.println("Enter Phone Number");
		System.out.println("Enter Email");
		System.out.println("Enter Adress");
		System.out.println("Select city");
		System.out.println("Select State");
		System.out.println("Enter postal code");
		System.out.println("Select country");
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Enter conformation password");
		System.out.println("Click on subbmit buttb");
		System.out.println("Get actual message");
		System.out.println("Get the expected message");
		System.out.println("Validate the message");

	}

	@Test(dependsOnMethods= {"verifyConformatonMessage"},groups= {"low"})
	public void verifyFlightDetails_Prefrences_Headings() {

		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Get actual title of Flight");
		System.out.println("Get Expected title of flights");
		System.out.println("Validate Fligts text");
		System.out.println("Get actual title of Prefrence");
		System.out.println("Get Expected title of Prefrences");
		System.out.println("Validate Prefrences text");

	}

	@AfterMethod(groups={"high"})
	public void postConditions() {
		System.out.println("Close Browser");
		System.out.println("Test case is Completed");
		System.out.println("------------------");
	}
	@BeforeGroups(groups= {"high"})
	public void highGroupInfo() {
		System.out.println("High Test cases started executes");
	}

}
