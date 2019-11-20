// printing the Order of the values
// Static is a shared variable
// updated value only effect every where after updation

package com.k2js.staticvariables.practice;

class OV{
	static int i=10;
	
	public static void main(String...abc){
		System.out.println(i);
		OV.i=20;
		new OV().i=30;
		
		System.out.println(new OV().i);
		System.out.println(OV.i);
		System.out.println(i);
	}
}