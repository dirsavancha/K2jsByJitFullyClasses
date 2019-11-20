// find the given string is palindrome or not with out using built in methods

package com.k2js.strings.practice;

class StringPalindrome {
	public static  void getCharIsPalindromeOrNot(String s){
		//int l=s.length();
		//int ite=0;
		//String s1=s.subString(0,l-l/2),s2=s.subString(l/2);ite<=l/2;ite++;
		//for(int ite=0;ite<=l/2;ite++){
		//	if(s1.charAt(ite)!=s2.charAt(s2.legnth()-(ite+1))){
		//		return "not palindrom";
		//	}
		//}
		
		int l=s.length();
		boolean pflg=true;
		for(int i=0;i<(l-l/2);i++){
			if(s.charAt(i)!=s.charAt(l-(i+1))){
				pflg=false;
			}
		}
		System.out.println(((pflg)?"":"not palindome")+"palindrom");

	}
}

class StringPalindromeTest{
	public static void main(String...abc){
		StringPalindrome.getCharIsPalindromeOrNot("madam");
	}
}