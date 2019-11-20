// Using finally block

package com.k2js.exceptionhandling.practice;

class Prog13{
	
	public static void m(String str){
		System.out.println("main method");
		try{
			System.out.println(str.length());
		}finally{
			System.out.println("Thank you for Calling");
		}
	}
}
class Prog13Test{
	
	public static void main(String...abc){
		Prog13.m("Hello");
		Prog13.m("K2js");
	}
}