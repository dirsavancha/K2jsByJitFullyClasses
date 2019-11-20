// Creating blocks

package com.k2js.aboutclass.practice;

class A{
	static {
		System.out.println("I am Static block "+A.i);
	}
	static int i=10;
	public static void main(String...abc){
		System.out.println("I am Main Method "+A.i);
	}
}