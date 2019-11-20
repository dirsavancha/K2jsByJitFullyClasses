// Another way to read the file
package com.k2js.filehandling.byorientedrw;

import java.io.FileInputStream;
import java.io.IOException;

public class FH_Prog4 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {
			int noOfelem = fis.available();
			//System.out.println(noOfelem);
			byte[] b = new byte[noOfelem];
			fis.read(b);
			String s=new String(b);
			System.out.println(s);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
