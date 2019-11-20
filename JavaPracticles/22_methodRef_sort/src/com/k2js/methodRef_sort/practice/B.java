// methodref with non static 

package com.k2js.methodRef_sort.practice;

import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.deepToString;

class B {
	
	String name;
	int age;
	
	B(String name){
		this.name=name;
		
	}
	
	B(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString(){
		return "name ="+this.name+"\t"+"id ="+this.age+"\t";
	
	}	
	public  int ageDiff(B s1,B s2){
		
		return s1.age-s2.age;
	}
	
}

class BTest{
	public static void main(String...abc){
		B[] s={new B("Ram",10),new B("Srikanth",52),new B("John",20),new B("sri",50),new B("anil",15),new B("Smith",25)};
		//System.out.println(B.ageDiff(s[0],s[1]));
		
		Arrays.sort(s, s[0]::ageDiff);
		System.out.println(deepToString(s));
	}
}