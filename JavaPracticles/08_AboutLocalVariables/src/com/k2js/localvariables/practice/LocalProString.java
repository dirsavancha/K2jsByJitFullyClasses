// Allocating spaces in between the strings

package com.k2js.localvariables.practice;

class Prg9{
	public static void m(){
		String s="Hello";
		int i=10;
		System.out.printf("%s%15d","Hello",10);
		//System.out.printf("%s%-15d","Hello",10); delete the spaces
	}
}
class Prg9Test{
	public static void main(String...abc){
		Prg9.m();
	}
}