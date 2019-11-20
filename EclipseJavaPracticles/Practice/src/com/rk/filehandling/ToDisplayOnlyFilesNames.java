// To display Only Directory/folder names

package com.rk.filehandling;

import java.io.File;

public class ToDisplayOnlyFilesNames {

	public static void main(String[] args) {
		File f= new File("D:\\");
		String[] str=f.list();
		for(String each_dir:str) {
			File f2=new File(f,each_dir);
			if(f2.isDirectory()) {
				System.out.println(each_dir);
				
			}
						
		}

	}

}
