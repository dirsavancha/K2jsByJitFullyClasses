// 
// Getting an error that :  error: cannot assign a value to final variable i

package com.k2js.staticvariables.practice;

class C{
	static{
		C.i=200;
		System.out.println(C.i);
	}
	final static int i;
}