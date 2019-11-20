package com.k2js.filehandling.serializaton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentMainClass2 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("Student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);){
			Object o=ois.readObject();
			Student s1=(Student)o;
			System.out.println(s1.age+" "+s1.name);
			
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}
}
