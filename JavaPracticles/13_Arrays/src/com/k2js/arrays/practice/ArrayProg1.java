//To check array is aclass

package com.k2js.arrays.practice;

class ArrayProg1{
	public static void main(String...abc){
		String s="Hello";
		System.out.println("String is a"+s.getClass().getName());
		int[] i={10};
		System.out.println("Array is a"+i.getClass().getName());
		System.out.println(i.length);
		System.out.println(s.length());
		
	}
	
}