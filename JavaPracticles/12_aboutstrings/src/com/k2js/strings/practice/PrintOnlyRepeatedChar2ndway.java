// print only repaeted char 2nd way

package com.k2js.strings.practice;

class PrintOnlyRepeatedChar2ndway{
	public static void printRepeatedchar(String s){
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if((!s.substring(0,i).contains(c+"")) && (s.length()-s.replace(c+"","").length()>1)){
				System.out.println(c);
				
			}
		}
	}
}

class PrintOnlyRepeatedCharTest2ndway{
	public static void main(String...abc){
		PrintOnlyRepeatedChar2ndway.printRepeatedchar("keys2javaselenium");
	}
}