

package com.k2js.localvariables.practice;

class Lp4{
	public static void m(){
		int a=10;
		{
			a=20;
		}
		System.out.println(a);
	}	
}
class Lp4Test{
	public static void main(String...abc){
		Lp4.m();
	}
}
