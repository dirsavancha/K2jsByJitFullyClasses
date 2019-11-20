// Find the sum of Prime Numbers

package com.k2js.arrays.practice;

class ArraysSumPrimeNum{
	
	public static void sumPrimeNum(int[] a){
		System.out.println(java.util.Arrays.stream(a).filter(x->{int c=0;for(int i=1;i<=x/2;i++){if(x%i==0)c++;}return(c==1)? true:false;}).sum());
		//System.out.println(java.util.Arrays.stream(a).filter(x->x%2==0).sum());  // to find sum of even numbers
		
	}
}

class ArraysSumPrimeNumTest{
	public static void main(String...abc){
		ArraysSumPrimeNum.sumPrimeNum(new int[] {12,5,6,17,4,3});
	}
}