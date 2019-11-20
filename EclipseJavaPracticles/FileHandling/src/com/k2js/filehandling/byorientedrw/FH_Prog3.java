//Find number of characters
package com.k2js.filehandling.byorientedrw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FH_Prog3 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {
			int noOfelem = fis.available();
			// System.out.println(noOfelem);
			byte[] b = new byte[noOfelem];
			fis.read(b);
			for (byte t : b) {
				System.out.print((char) t);
			}

			// System.out.println(Arrays.toString(b));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
