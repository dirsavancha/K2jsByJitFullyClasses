// Finding the Summ of all Digits

package com.k2js.loops.practice;

class FindsumOfAllDigits{
	public static int m(){
	int i=456782;
	int sum=0;
	int dc=0;
	for(int a=i;a!=0;a/=10){
		sum+=a%10;
	}
	return sum;
	}
}

class FindsumOfAllDigitsTest{
	public static void main(String...abc){
		int j=FindsumOfAllDigits.m();
		System.out.println("Sum of all digits is"+j);
	}
}