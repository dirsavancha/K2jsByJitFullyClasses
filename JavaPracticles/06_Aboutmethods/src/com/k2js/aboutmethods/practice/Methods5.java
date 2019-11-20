// Calling Non-Static Methods

package com.k2js.aboutmethods.practice;

class Methods5{
	
	public int m(){
		return 10;
	}
	
	public Number n(){
		return 20;
	}
	
	static public Methods5 obj(){
		
		return new Methods5();
	}
	
	static void add(){
		
		Methods5 o1=Methods5.obj();
		System.out.println(o1.m()+o1.n().intValue());
	}
	
}

class Methods5Test{
	public static void main(String...abc){
		Methods5.add();
	}
	
}