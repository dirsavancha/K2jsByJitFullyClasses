// Printing stack Trace of Exception
// It will print the in consol(with red lines)
//Exception
//Error message
//Stack trace Flow
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Prog4 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Location is wrong");
			e.printStackTrace();
		}
		System.out.println("Hello");
	}

}
