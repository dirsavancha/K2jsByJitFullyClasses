// Try to change the global Variable

package com.k2js.staticvariable.practice;

class DVC{
	
	static int i=10;
	// i=20;  // Directly if we change it will not allow to print
	static int j=i=20;  // Indirectly if we change it will allow to print
	public static void main(String...abc){
		System.out.println(DVC.i);
	}
	
}