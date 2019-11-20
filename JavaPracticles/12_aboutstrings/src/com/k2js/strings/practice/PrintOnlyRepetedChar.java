// Print only repeated chaacters

package com.k2js.strings.practice;

class PrintOnlyRepeatedChar{
	public static void printRepeatedchar(String s){
		for(int i=0;i<s.length();i++){
			char c=s.charAt(0);
			if((!s.substring(0,i).contains(c+"")) && (s.substring(i+1).contains(c+""))){
				System.out.println(c);
				
			}
		}
	}
}

class PrintOnlyRepeatedCharTest{
	public static void main(String...abc){
		PrintOnlyRepeatedChar.printRepeatedchar("keys2javaselenium");
	}
}