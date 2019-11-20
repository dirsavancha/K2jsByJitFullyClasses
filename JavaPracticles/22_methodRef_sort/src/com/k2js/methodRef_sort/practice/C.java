// methodref with Object type 

package com.k2js.methodRef_sort.practice;

import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.deepToString;

class C {
	
	String name;
	int age;
	
	C(String name){
		this.name=name;
		
	}
	
	C(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString(){
		return "name ="+this.name+"\t"+"id ="+this.age+"\t";
	
	}	
	public  int ageDiff(C s1,C s2){
		
		return s1.age-s2.age;
	}
	
	public int compareTo(C t){
		return this.name.compareTo()-t.name.compareTo();
	}
	
}

class CTest{
	public static void main(String...abc){
		C[] s={new C("Ram",10),new C("Srikanth",52),new C("John",20),new C("sri",50),new C("anil",15),new C("Smith",25)};
		//System.out.println(new ageDiff(s[0],s[1]));
		
		Arrays.sort(s, C::compareTo);
		System.out.println(deepToString(s));
	}
}