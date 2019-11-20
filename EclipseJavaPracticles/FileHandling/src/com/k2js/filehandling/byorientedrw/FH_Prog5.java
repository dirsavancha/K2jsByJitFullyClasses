package com.k2js.filehandling.byorientedrw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FH_Prog5 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt");
				FileOutputStream fos=new FileOutputStream("xyz.txt")){
			int noOfele=fis.available();
			byte[] b=new byte[noOfele];
			fis.read(b);
			fos.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
