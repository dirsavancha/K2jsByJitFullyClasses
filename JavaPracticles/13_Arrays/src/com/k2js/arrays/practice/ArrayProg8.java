// Print the value which is passing value in method

package com.k2js.arrays.practice;

class ArrayProg8{
	public static double sum(int[] a,double[] b){
		
		return a[a.length-1]+b[b.length-1];
		
	}
}

class ArrayProg8Test{
	public static void main(String...abc){
		double result=ArrayProg8.sum(new int[]{10},new double[]{15l});
		System.out.println(result);
	}
}