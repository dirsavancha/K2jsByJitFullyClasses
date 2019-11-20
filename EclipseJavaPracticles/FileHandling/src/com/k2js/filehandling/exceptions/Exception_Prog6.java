// it will give Exception +Error Message
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Prog6 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Location is wrong");
			System.out.println(e.toString());
		}
		System.out.println("Hello");
	}

}
