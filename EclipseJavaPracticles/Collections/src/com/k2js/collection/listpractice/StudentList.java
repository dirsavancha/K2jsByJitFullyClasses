package com.k2js.collection.listpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentList {
	public static void main(String[] args) {

		List<Student> allstudent = new ArrayList<>();

		allstudent.add(new Student(10, "Jit"));
		allstudent.add(new Student(8, "Ram"));
		allstudent.add(new Student(11, "Sai"));
		allstudent.add(new Student(13, "Krishna"));
		allstudent.add(new Student(9, "John"));
		// System.out.println(allstudent);

		for (Student st : allstudent) {
			System.out.println(st);

		}

		System.out.println("Descending Orer");

		// Collections.sort(allstudent, Collections.reverseOrder());

		// allstudent.sort((x,y)->y.id-x.id); // sorting in descending order

		for (Student st : allstudent) {
			System.out.println(st);

		}
		// without lamda
		// StudentList st=new StudentList();

		Collections.sort(allstudent);
		System.out.println(allstudent);
		System.out.println(allstudent);

	}

}
