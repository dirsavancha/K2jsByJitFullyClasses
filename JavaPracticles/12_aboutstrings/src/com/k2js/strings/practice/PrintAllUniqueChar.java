//Print all unique Characters from the given string

package com.k2js.strings.practice;

class PrintAllUniqueChar{
	public static void uniqueChar(String s){
		char unique=0;
		
		for(; s.length()>0;){
			char c=s.charAt(0);
			System.out.println(c);
			s=s.replace(c+"","");
			
		}
		
	}
}

class PrintAllUniqueCharTest{
	public static void main(String...abc){
		PrintAllUniqueChar.uniqueChar("keys2javaselenium");
	}
}