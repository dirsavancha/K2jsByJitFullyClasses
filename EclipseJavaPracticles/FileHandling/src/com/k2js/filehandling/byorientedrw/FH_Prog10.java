package com.k2js.filehandling.byorientedrw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FH_Prog10 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
				BufferedWriter bw=new BufferedWriter(new FileWriter("abc1.txt"))){
			
			
		}catch (IOException e) {
		}
	}

}
