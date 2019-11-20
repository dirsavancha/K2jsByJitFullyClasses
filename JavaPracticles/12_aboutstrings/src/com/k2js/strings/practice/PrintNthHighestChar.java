// Print nth Highest Character with out using sort method

package com.k2js.strings.practice;

class PrintNthHighestChar{
	public static void printHighestValue(String s,int high){
		char nhigh=0;
		for(int i=0;i<high;i++){
			char max=0;
			for(char c:s.toCharArray){
				max=max<c?c:max;
				
			}
			s=s.replace(max+"","");
			nhigh=max;
			
		}
		System.out.println(nhigh);
	}
}

class PrintNthHighestCharTest{
	public static void main(String...abc){
		PrintNthHighestChar.printHighestValue("keys2javaselenium");
	}
}