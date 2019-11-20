// methodref with static 

package com.k2js.methodRef_sort.practice;

import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.deepToString;

class A {
	
	String name;
	int age;
	
	A(String name){
		this.name=name;
		
	}
	
	A(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString(){
		return "name ="+this.name+"\t"+"id ="+this.age+"\t";
	
	}	
	public static int ageDiff(A s1,A s2){
		
		return s1.age-s2.age;
	}
	
}

class ATest{
	public static void main(String...abc){
		A[] s={new A("Ram",10),new A("Srikanth",52),new A("John",20),new A("sri",50),new A("anil",15),new A("Smith",25)};
		System.out.println(A.ageDiff(s[0],s[1]));
		
		Arrays.sort(s,A::ageDiff);
		System.out.println(deepToString(s));
	}
}