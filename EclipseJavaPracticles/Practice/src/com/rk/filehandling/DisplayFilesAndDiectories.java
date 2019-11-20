// To display names of all files and directories present in given file path
package com.rk.filehandling;

import java.io.File;

public class DisplayFilesAndDiectories {

	public static void main(String[] args) {
		int count=0;
		File f=new File("D:\\");
		String[] s=f.list();
		for(String each:s) {
			count++;
			System.out.println(each);
			
		}
		System.out.println(count);
	}

}
