package com.k2js.filehandling.serializaton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentMainClass {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("Student.txt");

				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Student s = new Student("Jit", 40);
			oos.writeObject(s);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
