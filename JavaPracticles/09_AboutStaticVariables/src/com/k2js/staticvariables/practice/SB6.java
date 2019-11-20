//

package com.k2js.staticvariables.practice;

class SB6{
	
		static {
		System.out.println(SB6.i);
	}
	
	static int i=10;
	
	
	static{
		System.out.println(i);
	}
	
	
	public static void main(String...abc){
		// Static variable and static block executes automatically no need to call in main method
		// Internally static variable load only one
	}
		
}