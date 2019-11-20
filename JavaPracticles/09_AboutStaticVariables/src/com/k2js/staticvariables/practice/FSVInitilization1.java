// Initilization of final static variable second method

package com.k2js.staticvariables.practice;

class FSV1{
	final static int i;
	static int j=i=10;
	public static void main(String...abc){
		System.out.println(i);
	}
}