// Only public and protected classes can access when we inherit from another package class 

package com.k2js.accessmodifiers.practice.practice2;

import com.k2js.accessmodifiers.practice.A;

class F extends A{
	
	public static void main(String...abc){
		F f1=new F();
		System.out.println("I am public"+f1.i4);
		System.out.println("I am protected"+f1.i3);
		//System.out.println("I am default"+f1.i2);
		//System.out.println("I am Private"+f1.i1);
	}
	
}