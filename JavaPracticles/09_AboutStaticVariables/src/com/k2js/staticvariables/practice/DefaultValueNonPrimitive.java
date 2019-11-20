// Default values for Non Primitives
// Default Value for an Non Primitive is NULL

package com.k2js.staticvariables.practice;

class DVNP{
	static Integer i;
	static String s1;
	static DVNP dv;
	
	public static void main(String...abc){
		System.out.println(DVNP.i+" default Value for Integer");
		System.out.println(DVNP.s1+" default Value for String");
		System.out.println(DVNP.dv+" default Value for current Class");
		
	}
}