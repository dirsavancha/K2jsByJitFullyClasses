package com.k2js.mavenfinalfw.practice.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailRerun implements IRetryAnalyzer{

	public boolean retry(ITestResult result) {
		int min=0;
		int max=2;

		if(min<max) {
			min++;
			return true;
		}
		return false;
	}
}