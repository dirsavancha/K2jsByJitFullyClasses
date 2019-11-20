// Find the sum of Eve Numbers

package com.k2js.arrays.practice;

class ArraysSumEvenNum{
	
	public static void sumEvenNum(int[] a){
		System.out.println(java.util.Arrays.stream(a).filter(x->x%2==0).sum());  // to find sum of even numbers
		
	}
}

class ArraysSumPrimeNumTest{
	public static void main(String...abc){
		ArraysSumEvenNum.sumEvenNum(new int[] {12,5,6,17,4,3});
	}
}