//sorting

package com.k2js.sorting.practice;

import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.deepToString;

class Student implements Comparable<Student>{
	
	String name;
	int id;
	
	Student(String name){
		this.name=name;
		
	}
	
	Student(String name,int id){
		this.name=name;
		this.id=id;
		
	}
	@Override
	public String toString(){
		return "name ="+this.name+"\t"+"id ="+this.id+"\t";
	
	}
	@Override
	
	public int compareTo(Student s){
		
		return this.name.compareTo(s.name);
	}
	
}

class StudentTest{
	public static void main(String...abc){
		Student[] s={new Student("Ram",10),new Student("Srikanth",52),new Student("John",20),new Student("sri",50),new Student("anil",15),new Student("Smith",25)};
		// Sorting by name
		
		//Arrays.sort(s);
		
		// it checking if name is duplicate then it will sort on basis of id
		// Lambda Expression
		Arrays.sort(s,(x,y)-> x.compareTo(y)==0?x.id-y.id:x.compareTo(y));
		System.out.println(deepToString(s));
		//
		Arrays.sort(s,(x,y)->x.id-y.id);
		System.out.println(deepToString(s));
		
		// Arrays.sort(s,(x,y)->x.compareTo)
	}
}
