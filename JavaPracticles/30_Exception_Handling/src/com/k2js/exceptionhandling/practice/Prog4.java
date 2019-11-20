//

package com.k2js.exceptionhandling.practice;

class Prog4{
	
	public void findLength(String s){
		System.out.println("find length method");
	
		System.out.println(s.length());
	}
	public static void main(String...abc){
		System.out.println("main method");
		
			Prog4 p4=new Prog4();
			p4.findLength("Hello");
			p4.findLength(null);
			System.out.println("Completed");
	}
	
}