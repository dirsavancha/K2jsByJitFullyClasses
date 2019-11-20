// Giving correct file name it will skip the try catch block
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Prog3 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Location is wrong");
		}
		System.out.println("Hello");
	}

}
