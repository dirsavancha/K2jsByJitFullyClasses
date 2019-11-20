// Count the how many Prime numbers are present in an array

package com.k2js.arrays.practice;

class ArrayProg18{
	public static void primeCount(Comparable[] c){
		int pc=0;
		for(Comparable t:c){
			if(t instanceof Number){
				int count=0;
				Number n=(Number)t;
				for(int i=1;i<=n.intValue()/2;i++){
					count=(n.intValue()%i==0)? ++count:count;
					
				}
				pc=(count==1)?++pc:pc;
				
			}
			
		}
		System.out.println(pc);	
	}
}

class ArrayProg18Test{
	public static void main(String...abc){
		ArrayProg18.primeCount(new Comparable[]{10,15.,17.,19.,16f,"Hello"});
	}
}