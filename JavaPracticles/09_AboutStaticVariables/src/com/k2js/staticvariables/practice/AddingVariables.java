// Adding two variables

package com.k2js.staticvariables.practice;

class A{
	static int i=10;
	       int j=20;
		   
		public static void m(){
			int i=30,j=40;
			int add=(i+A.i+j+new A().j);
			System.out.println(add);
		}	
		   
}

class ATest{
	public static void main(String...abc){
		A.m();
	}
}