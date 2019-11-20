package com.k2js.filehandling.byorientedrw;

import java.io.FileInputStream;
import java.io.IOException;

public class FH_Prog1 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {
			int b = fis.read();
			System.out.println((char) b);
		} catch (IOException e) {
			System.out.println("File name is not wrong");
			e.printStackTrace();

		}

	}

}
