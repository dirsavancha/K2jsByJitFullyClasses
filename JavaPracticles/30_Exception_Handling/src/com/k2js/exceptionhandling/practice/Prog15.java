//  Custom Exception

package com.k2js.exceptionhandling.practice;

class A extends NullPointerException{
	public String getMessage(){
		return"null is not a valid input";
	}
	public String toString(){
		return "don't pass null";
	}
}

class Prog15 {
	
	public static void m(String str){
		int i=100;
		System.out.println("main method");
		try{
			int l=str.length();
			System.out.println(l);
			System.out.println(i%l);
		}catch(NullPointerException e){
			e =new A();
			e.printStackTrace();
			
			throw e;
		}catch(ArithmeticException a){
			System.out.println(a.getMessage());
			throw a;
			
		}
	}
}

class Prog15Test{
	
	public static void main(String...abc){
		Prog15.m("Hello");
		Prog15.m("K2js");
		//Prog15.m("");
		Prog15.m(null);
	}
}