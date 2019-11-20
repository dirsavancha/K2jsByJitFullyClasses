package com.k2js.filehandling.byorientedrw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FH_Prog8 {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))){
			String data=br.readLine();
			System.out.println(data);
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

}
