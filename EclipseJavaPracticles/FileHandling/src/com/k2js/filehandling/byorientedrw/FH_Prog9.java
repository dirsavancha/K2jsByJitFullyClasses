package com.k2js.filehandling.byorientedrw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FH_Prog9 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
			for (String data = null; (data = (br.readLine())) != null;) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
