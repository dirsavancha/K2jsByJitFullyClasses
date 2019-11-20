// Reverse the values and store

package com.k2js.arrays.practice;

class ArraysReverse{
	
	public static void m(String[] s1,String[] s2){
		
		for(int i=s1.length-1;i>=0;i--){
			System.out.println(s2[s1.length-i-1]=s1[i]);
			//s2[s1.length-i-1]=s1[i];
			//for(String s:s1){
				//System.out.println(s);
				
			//}
			
		}
		
	}
}

class ArraysReverseTest{
	public static void main(String...abc){
		String[] s={"apple","banana","grapes"};
		ArraysReverse.m(s,new String[s.length]);
	}
}