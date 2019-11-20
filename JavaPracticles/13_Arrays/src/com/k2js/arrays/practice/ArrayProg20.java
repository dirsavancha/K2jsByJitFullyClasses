// Sort 

package com.k2js.arrays.practice;
import java.util.Arrays;

class ArrayProg20{
	public static void evenNum(int[] a){
		System.out.println("Before Sorting"+Arrays.toString(a));
		Arrays.sort(a);
		
		System.out.println("After Sorting"+Arrays.toString(a));  // we can use to String instead of for loop
		
		System.out.println((Arrays.asList(a)));
		
	}
	
}
class ArrayProg20Test{
	public static void main(String...abc){
		ArrayProg20.evenNum(new int[]{25,5,3,15,16});
	}
}