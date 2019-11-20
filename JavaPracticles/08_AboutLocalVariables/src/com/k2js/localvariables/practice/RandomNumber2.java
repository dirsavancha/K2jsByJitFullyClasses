// Generating two numbers finding the biggest number among them and print the biggest number

package com.k2js.localvariables.practice;

class Lp8{
	public static void m(){
		int i=(int)((Math.random()*2)+11);
		boolean a=(i%10==0);
		boolean b=(i%10!=1);
	  String res=(a||b)?"Least":"greater";
	  System.out.println(i+"is"+res);
		
	}
}
class Lp8Test{
	public static void main(String...abc){
		Lp8.m();

	}
}
