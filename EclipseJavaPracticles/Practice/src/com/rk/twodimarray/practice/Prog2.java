package com.rk.twodimarray.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog2 {
	static String[][] testdata = {
			{ "TCID", "TCName", "Run Status", "DataField1", "DataField2", "DataField3", "DataField4" },
			{ "TC001", "VerifyHomePage", "Yes", "Welcome:M Tours" },
			{ "TC002", "VerifyRegistrationProcess", "Yes", "Key", "Java", "1234567891", "abc@gmail.com" },
			{ "TC003", "VerifyLogin", "Yes", "tutorial", "tutorial" },
			{ "TC002", "VerifyPaymentProcess", "Yes", "Java", "Selenium", "456789456", "xyz@gmail.com" },
			{ "TC003", "VerifyLogin", "No", "test123", "test123" } };

	public static String[][] storeTestData(String testName) {
		List<String[]> td = new ArrayList<>();

		for (int i = 1; i < testdata.length; i++) {
			String tcn = testdata[i][1]; // tcn= test case name
			String tcs = testdata[i][2];// tcs= test case status
			if (tcn.equalsIgnoreCase(testName) && tcs.equalsIgnoreCase("Yes")) {
				List<String> data = new ArrayList<>();
				for (int j = 3; j < testdata[i].length; j++) {
					data.add(testdata[i][j]);

				}
				data.add(i + "");
				td.add(data.toArray(new String[0]));
//td.add(i+"");	
			}

		}
		String[][] alltd = td.toArray(new String[0][0]);
		return alltd;
	}





	public static void main(String... abc) {
		System.out.println(Arrays.deepToString(Prog2.storeTestData("VerifyHomePage")));
	}

}
