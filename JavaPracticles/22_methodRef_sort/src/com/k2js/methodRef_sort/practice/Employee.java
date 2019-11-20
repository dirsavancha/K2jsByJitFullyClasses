//

package com.k2js.methodRef_sort.practice;

import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.deepToString;

class Employee{
	
	static String name;
	int id,sal;
	
	Employee(String name,int id,int sal){
		
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	@Override
	public String toString(){
		return "name ="+this.name+"\t"+"id ="+this.id+"\t"+"sal ="+this.sal;
	
	}
	public static int ageDiff(Employee e1,Employee e2){
		
		return s1.age-s2.age;
	}
}