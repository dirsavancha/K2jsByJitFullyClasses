// find the length of both values byplacing the variables outside the method

package com.k2js.arrays.practice;

class ArrayProg4{
	
	static String s="Hello";
	       int[] i={};
		   public static void arrM(){
			   System.out.println(ArrayProg4.s.length()+new ArrayProg4().i.length);
		   }
}

class ArrayProg4Test{
	public static void main(String...abc){
		ArrayProg4.arrM();
	}
}