// find the small char

package com.k2js.strings.practice;

class FindSmallChar{
	public static char getSmallChar(String s){
		char smallchar=s.charAt(0);
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			smallchar=smallchar>c?c:smallchar;
		}
		return smallchar;
	}
}
class FindSmallCharTest{
	public static void main(String...abc){
		char small=FindSmallChar.getSmallChar("keys2javaselenium");
		System.out.println(small);
	}
}