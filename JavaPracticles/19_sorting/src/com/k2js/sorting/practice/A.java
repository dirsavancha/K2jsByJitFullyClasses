// Sorting the values using inbuilt method

package com.k2js.sorting.practice;

class A{
	public static void main(String...abc){
		Integer[] i={10,5,20,3,16};
		java.util.Arrays.sort(i);
		System.out.println(java.util.Arrays.deepToString(i));  // deepToString can print the 1d and 2d array
		//System.out.println(java.util.Arrays.toString(i));  //can print only 1d array
		
	
	}
}

// o/p [3, 5, 10, 16, 20]