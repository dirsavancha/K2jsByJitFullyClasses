// File Read
package com.k2js.filehandling.byorientedrw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FH_Prog6 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("abc.txt")) {
			System.out.println((char) fr.read());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
