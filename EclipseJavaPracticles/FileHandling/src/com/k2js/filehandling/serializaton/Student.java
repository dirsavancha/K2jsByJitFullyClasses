package com.k2js.filehandling.serializaton;

import java.io.Serializable;

public class Student implements Serializable {
	int age;
	String name;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "age ="+this.age+"name ="+this.name;
	}
}
