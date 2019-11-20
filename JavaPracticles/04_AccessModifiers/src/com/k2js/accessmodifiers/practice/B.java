// Access Modifiers access Outside a class with in same package by creating Object to previous class(class A)

// It will allow all except Private

package com.k2js.accessmodifiers.practice;

class B{
	public static void main(String...abc){
		A a1=new A();
		System.out.println("I am default"+a1.i2);
		System.out.println("I am Protected"+a1.i3);
		System.out.println("I am public"+a1.i4);
		//System.out.println("I am private"+a1.i1);
	}
}