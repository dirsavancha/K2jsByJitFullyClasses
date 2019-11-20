
// handling try catch with wrong file name
// Givivng incorrect file name it will enter into the try catch block
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Prog2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Location is wrong");
		}
		System.out.println("Hello");
	}

}
