// All Access Modifiers can access with in class

package com.k2js.accessmodifiers.practice;

public class A{
	
	 private int i1=10;
	         int i2=20;
     protected int i3=30;
     public int i4=40;
		public static void main(String...abc){
			A a1=new A();
			System.out.println("I am private"+a1.i1);
			System.out.println("I am default"+a1.i2);
			System.out.println("I am protected"+a1.i3);
			System.out.println("I am Public"+a1.i4);
		}
}