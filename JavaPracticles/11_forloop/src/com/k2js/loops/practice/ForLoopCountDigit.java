// Count the Number of digits

package com.k2js.loops.practice;

class ForLoopCountDigit{
	public static int m(){
		int i=456782;
		int dc=0;
		for(int a=i;a!=0;a/=10){
			dc++;
		}
		return dc;
	}
}
class ForLoopCountDigitTest{
	public static void main(String...abc){
		int j=ForLoopCountDigit.m();
		System.out.println("Total Digit count is"+j);
		
	}
}