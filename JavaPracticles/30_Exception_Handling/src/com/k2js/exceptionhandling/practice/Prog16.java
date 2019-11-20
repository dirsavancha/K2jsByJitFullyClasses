// Writing return types in try catch

package com.k2js.exceptionhandling.practice;

class Prog16{
	
	public static int m(int i,int j){
		
		try{
			return i%j;
		}catch(ArithmeticException e){
			return 1;
			
		}
		
	}
}

class Prog16Test{
	public static void main(String...abc){
		System.out.println(Prog16.m(10,5));
		System.out.println(Prog16.m(10,0));
	}
}