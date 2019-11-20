// 

package com.k2js.arrays.practice;
class ArrayProg7{
	private static Integer[] allvalues={10,20,30,Integer.valueOf(15),Integer.parseInt("25"),Integer.max(17,22)};
	
	public static Integer[] getArray(){
		
		
		return ArrayProg7.allvalues;
	}
}
class ArrayProg7Test{
	public static String findArrayLengthEvenOdd(){
		return (ArrayProg7.getArray().length%2==0)?"Even":"odd";
	}
		
	
}