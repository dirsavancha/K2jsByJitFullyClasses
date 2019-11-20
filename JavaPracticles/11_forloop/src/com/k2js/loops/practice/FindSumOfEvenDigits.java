// Find the sum of Only Even Digits


package com.k2js.loops.practice;

class SumOfEvenDigits{
	public static int m(){
		int i=456782;
		int even=0;
		int sum=0;
		for(int a=i;a!=0;a/=10){
			sum=a%10;
			if(a%2==0){
				even+=sum;
			}
			
		}
		return even;
	}
}

class SumOfEvenDigitsTest{
	public static void main(String...abc){
		int j=SumOfEvenDigits.m();
		
	}
}