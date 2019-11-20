//changing catch(In Java A parent Exception Can handle any of its child exception butchild cant handle parent)
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception_Prog9 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {

		}catch (IOException e1) {
			System.out.println(e1.toString());
		}
	}/*
		 * catch (FileNotFoundException e) {
		 * System.out.println("File Location is wrong"); System.out.println(e);
		 * 
		 * }
		 */

}
