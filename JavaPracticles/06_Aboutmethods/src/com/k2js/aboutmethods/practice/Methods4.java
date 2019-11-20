// Calling Methods

package com.k2js.aboutmethods.practice;

class Methods4{
	public static Object a(){
		return  30;
	}
	public static int a(Number n){
		return 10*(int)n;
	}
	public static String sum(){
		int i=(Integer)Methods4.a();
		int j=(Integer)Methods4.a(20);
		System.out.println(i+j);
		 
		return "";
	}
}
class Methods4Test{
	public static void main(String...abc){
		String s=Methods4.sum();
		System.out.println(s);
	}
}