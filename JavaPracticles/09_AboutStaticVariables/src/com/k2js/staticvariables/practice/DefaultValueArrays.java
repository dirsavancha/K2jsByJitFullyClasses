// default values in an array
// Default Value for an Non Primitive Array is NULL

package com.k2js.staticvariables.practice;

class DVA{
	static int[] i;
	static String[] s;
	static DVA[] d;
	
	public static void main(String...abc){
		System.out.println(DVA.i+" default Value for int []");
		System.out.println(DVA.s+" default value for String[]");
		System.out.println(DVA.d+" default value for cureen class []");
		
	}
}