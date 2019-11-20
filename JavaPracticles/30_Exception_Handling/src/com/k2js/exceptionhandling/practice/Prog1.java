//

package com.k2js.exceptionhandling.practice;

class Prog1{
	
	public void findLength(String s){
		
		System.out.println("find length method");
		System.out.println(s.length());
		
	}
	public static void main(String... abc){
		System.out.println("main method");
		
		Prog1 p1=new Prog1();
		p1.findLength("Hello");
	
			p1.findLength(abc[0]);  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println("done..!");
		
	
	}
}

