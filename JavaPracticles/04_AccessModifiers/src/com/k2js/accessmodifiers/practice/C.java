// Accessing all modifiers with in same package with different file by using extends Keyword

// Here we cant access private by using extends Keyword 

// we can't inherit private members

// Here we can create Object to the current class and we can use the another class members(except private)

package com.k2js.accessmodifiers.practice;

class C extends A{
	public static void main(String...abc){
	
		C c1=new C();
		System.out.println("I am default"+c1.i2);
		System.out.println("I am protected"+c1.i3);
		System.out.println("I am public"+c1.i4);
		//System.out.println("I am protected"+c1.i1);
	}
}