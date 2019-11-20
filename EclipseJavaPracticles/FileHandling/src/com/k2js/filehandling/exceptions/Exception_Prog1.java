// Bypassing the checked exception by writing throws keyword
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_Prog1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		System.out.println();
		fis.close();
	}

}
