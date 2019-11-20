// After giving the relavent information want to break
package com.k2js.filehandling.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception_Prog11 {

	public static void main(String[] args) throws IOException {
		try (FileInputStream fis = new FileInputStream("abc1.txt")) {

		}catch (IOException e) {
			System.out.println("File Location is wrong");
			e.printStackTrace();
			throw e;
		}
		
	}

}
