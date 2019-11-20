// A Parent handle any of its child exception
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception_Prog10 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("abc.txt");
	}

}
