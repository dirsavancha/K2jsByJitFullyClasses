// Default ValueBase

// Default value for char is 0(Zero);

package com.k2js.staticvariables.practice;

class DV{
	static byte b1;
	static short s1;
	static long l1;
	static float f1;
	static double d1;
	static boolean b2;
	static int i;
	static char c1;
	
	
	public static void main(String...abc){
		System.out.println(DV.i+" Default value for int");
		System.out.println(DV.b1+ " Default value for byte");
		System.out.println(DV.s1+ " Default value for short");
		System.out.println(DV.l1+ " Default value for long");
		System.out.println(DV.f1+ " Default value for float");
		System.out.println(DV.d1+ " Default value for double");
		System.out.println(DV.b2 + " Default values for boolean");
		System.out.println((int)DV.c1+ " Default value for char"); // Default value for char is Zero; it should convert in to (int)
		
	}
}