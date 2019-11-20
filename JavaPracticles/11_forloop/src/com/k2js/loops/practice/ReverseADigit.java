// Reverse a digit

package com.k2js.loops.practice;

class ReverseADigits{
	
	public static void reverseNumber(int num){
		int rev=0;
		int digit=0;
		
		for(int i=num;i!=0;i/=10){
			int d=i%10;
			rev=rev*10+d;
		}
		System.out.println(rev);
		
	}
	
}

class ReverseADigitsTest{
	public static void main(String...abc){
		ReverseADigits.reverseNumber(156723);
	}
}