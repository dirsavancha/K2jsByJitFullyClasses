// Generating Random numbers

package com.k2js.localvariables.practice;

class Lp5{
	public static void m(){
		int i=(int)(Math.random()*10)+1;
		System.out.println(i);
	}
}

class Lp5Test{
	public static void main(String...abc){
		Lp5.m();
	}
}