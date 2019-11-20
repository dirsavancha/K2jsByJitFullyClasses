// importing fully qualified name (means importing the full class path of that class)
//Should create object for the class A(class is another package )

package com.k2js.accessmodifiers.practice.practice2;

import com.k2js.accessmodifiers.practice.A; //or com.k2js.accessmodifiers.practice.*;

class E {
	public static void main(String...abc){
		A a1=new A();
		   // System.out.println("I am private"+a1.i1);
			//System.out.println("I am default"+a1.i2);
			//System.out.println("I am protected"+a1.i3);
			System.out.println("I am Public"+a1.i4);
		
	
	}
}