//Print all unique Characters from the given string 2nd way

package com.k2js.strings.practice;

class PrintAllUniqueChar2ndway{
	public static void uniqueChar(String s){
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(!s.substring(0,i).contains(c+"")){
				System.out.println(c);
			}
		}
	}
}

class PrintAllUniqueChar2ndwayTest{
	public static void main(String...abc){
		PrintAllUniqueChar2ndway.uniqueChar("keys2javaselenium");
	}
}