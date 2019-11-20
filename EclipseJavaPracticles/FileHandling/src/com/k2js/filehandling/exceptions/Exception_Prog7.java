// close the opened file
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_Prog7 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Location is wrong");
			System.out.println(e);
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();

				}
			}
		}
	}

}
