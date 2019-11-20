package com.k2js.filehandling.assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CountWords {

	public static void main(String[] args) {
		int wordCount=0;
		try(BufferedReader br=new BufferedReader(new FileReader("Example.txt"))){
			for(String data=null;(data=br.readLine())!=null;) {
				String wordlist[]=data.split(" ");
				wordCount+=wordlist.length;
				System.out.println(Arrays.deepToString(wordlist));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} System.out.println(wordCount);
	}

}
