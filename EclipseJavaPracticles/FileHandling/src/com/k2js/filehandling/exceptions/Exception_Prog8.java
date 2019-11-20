// In java 1.8 closing operation will done automatically from below syntax(syntax is called file with resources)

package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_Prog8 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {

		} catch (FileNotFoundException e) {
			System.out.println("File Location is wrong");
			System.out.println(e);

		} catch (IOException e1) {
			System.out.println(e1.toString());
		}

	}

}
