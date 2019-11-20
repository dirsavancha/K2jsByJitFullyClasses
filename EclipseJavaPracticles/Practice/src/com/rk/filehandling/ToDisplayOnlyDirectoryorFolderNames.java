// To display Only file names

package com.rk.filehandling;

import java.io.File;

public class ToDisplayOnlyDirectoryorFolderNames {

	public static void main(String[] args) {
		int count=0;
			File f=new File("D:\\");
			//File [] file=f.listFiles();
			String[] str=f.list();
			for(String each_file:str) {
				File f1=new File(f,each_file);
				if(f1.isFile()) {
					count++;
					System.out.println(each_file);
				}
				
			}
	}

}
