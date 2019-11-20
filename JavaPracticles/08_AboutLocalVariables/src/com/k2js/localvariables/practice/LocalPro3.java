
package com.k2js.localvariables.practice;

class Lp3{
	public static void m(int a,int b){
		int a=40;
		int b=50;
		System.out.println(a-b);
		//error: variable b is already defined in method m(int,int)
	}
}