// Calling the methods

package com.k2js.aboutmethods.practice;

class Methods2{
	private static int a(){
		return 10;
	}
	private static int b(){
		return 20;
	}
	
	}
	public static void sum(){
		int v1=Methods2.a();
		int v2=Methods2.b();
		int v=v1+v2;
		System.out.println("Addition is"+v);
	
	}
}
class Methods2Test{
	public static void main(String...abc){
		Methods2.sum();
	}
}

