package com.rk.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFilesInCurrentAndAnotherDirectories {

	public static void main(String[] args) throws IOException {
		// Creating a file current directory
		File f=new File("demo.txt");
		f.createNewFile();
		File f2=new File("Rk");
		f2.mkdir();
		
		//File f3=new File("RK","abc.txt"); or
		File f3=new File(f2, "abc.txt");
		f3.createNewFile();
		
		// Creating a file in another directory D
		
		File f4=new File("D:\\XYZ");
		f4.mkdir();
		File f5=new File(f4, "demo.txt");
		f5.createNewFile();
		
	}

}
