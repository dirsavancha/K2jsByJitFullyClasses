// Find the total length of an array and find the char in each word

package com.k2js.arrays.practice;

class ArrayProg5{
	static CharSequence[] cs={"Hello",new StringBuffer("Java"),new StringBuilder("Apples"),(CharSequence)"Programmer"};
	
	public static void arrM(){
		System.out.println("Count of an Array is "+ArrayProg5.cs.length);
		System.out.println(ArrayProg5.cs[0].length());
		System.out.println(ArrayProg5.cs[1].length());
		System.out.println(ArrayProg5.cs[2].length());
		System.out.println(ArrayProg5.cs[3].length());
		System.out.println("Total Count is "+(ArrayProg5.cs[0].length()+ArrayProg5.cs[1].length()+ArrayProg5.cs[2].length()+ArrayProg5.cs[3].length()));
		
		
	}
}

class ArrayProg5Test{
	public static void main(String...abc){
		ArrayProg5.arrM();
	}
}