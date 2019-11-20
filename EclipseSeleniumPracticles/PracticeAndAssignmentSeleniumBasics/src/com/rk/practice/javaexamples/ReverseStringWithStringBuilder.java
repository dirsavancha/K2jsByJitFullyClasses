package com.rk.practice.javaexamples;

public class ReverseStringWithStringBuilder {

	public static void main(String[] args) {
		String str1="Automation";
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		System.out.println(sb);
		// With out using StringBuilder
		
		String rev="";
		for(int i=str1.length()-1;i>=0;i--) {
			rev=rev+str1.charAt(i);
			
		}System.out.println(rev);
	}

	
}
