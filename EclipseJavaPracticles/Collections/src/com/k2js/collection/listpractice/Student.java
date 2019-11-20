package com.k2js.collection.listpractice;

public class Student implements Comparable<Student> {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Student details" + this.id + "\t" + "Student name" + this.name + "\t";
	}

	@Override
	public int compareTo(Student s) {
		//return id;
		return ((Integer)this.id).hashCode()-((Integer)s.id).hashCode();
	}
}




