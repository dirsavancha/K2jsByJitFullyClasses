// print the each digit in seperate line

package com.k2js.loops.practice;

class PrintEachDigit{
	
	public static int digitCount(int num){
		int count=0;
		for(int a=num;a!=0;count++,a/=10);
		 
			return count;
	}
	public static int tenMulti(int dcount){
		int tens=1;
		for(int t=1;t<dcount;t++){
			tens*=10;
		}
	
		return tens;
		
	}
	
	
	public static void printLeftDigit(int num){
		int dc=PrintEachDigit.digitCount(num);
		int tendenominator=PrintEachDigit.tenMulti(dc);
		for(int rh=num;rh!=0;rh%=tendenominator,tendenominator/=10){
			int lh=(rh/tendenominator);
             System.out.println(lh);
			
			//for(int n=num;n!=0;n/=10){
				//int d=num%tendenominator%10;
				//tendenominator/=10;
				//System.out.println(d);
				
			
			
		}
		
		
	}
	    
}

class PrintEachDigitTest{
	public static void main(String...abc){
		PrintEachDigit.printLeftDigit(156723);
	
	}
}