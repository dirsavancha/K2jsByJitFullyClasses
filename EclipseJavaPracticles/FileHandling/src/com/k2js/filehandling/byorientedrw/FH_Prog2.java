package com.k2js.filehandling.byorientedrw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FH_Prog2 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {
			System.out.println(fis.available());

			// byte[] bb = new byte[fis.available()];
			for (int b = 0; (b = fis.read()) != -1; System.out.print((char) b))
				;
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
