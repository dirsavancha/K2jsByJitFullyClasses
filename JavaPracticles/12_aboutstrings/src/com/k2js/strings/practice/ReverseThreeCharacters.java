// Reverse three characters

package com.k2js.strings.practice;

class ReverseThreeCharacters{
	public static void reverseOnlyThreeCharacters(String s){
		int l=s.length();
		for(int i=0;i<l;i+=3){
			String ss=(l-i)>=3?s.substring(i,i+3):s.substring(i);
			System.out.println(new StringBuilder(ss).reverse());
			
		}
	}
}

class ReverseThreeCharactersTest{
	public static void main(String...abc){
		ReverseThreeCharacters.reverseOnlyThreeCharacters("keys2javaselenium");
	}
}
