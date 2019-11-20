// Adding all digits until we get the single digit
//3+2=5;5+7=12;12+6=18;18+5=23;23+1=24, then 2+4=6, Ans:6;

package com.k2js.loops.practice;

class AddingAllDigits{
	public static void addingAllDigitsUntilGetSingleDigit(int num){
		int sum=0;
		for(int a=num;a!=0;){ // for(int a=num;a!=0;a/=10)
			int d=a%10;
			sum +=d;
			if((a/=10)==0 && sum>=10){
				a=sum;
				sum=0;
			}
			
		}
		System.out.println(sum);
		
		
	}
}
class AddingAllDigitsTest{
	public static void main(String...abc){
		AddingAllDigits.addingAllDigitsUntilGetSingleDigit(156723);
	}
}