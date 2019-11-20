// Sort 

package com.k2js.arrays.practice;
import java.util.Arrays;

class ArrayProg20_1{
	public static void sort(Integer[] a){
		System.out.println("Before Sorting"+Arrays.toString(a));
		Arrays.sort(a);
		
		System.out.println("After Sorting"+Arrays.toString(a));  // we can use to String instead of for loop
		
		System.out.println((Arrays.asList(a)));
		System.out.printil(Arrays.deepToString(a));
		
	}
	
}
class ArrayProg20_1Test{
	public static void main(String...abc){
		ArrayProg20_1.sort(new Integer[]{25,5,3,15,16});
	}
}