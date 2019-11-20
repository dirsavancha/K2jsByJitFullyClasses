// finding the biggest character without forloop

package com.k2js.strings.practice;

class FindingBiggestCharWithoutForloop{
	public static char getBiggestCharWithoutForloop(String s){
		
		char[] c=s.toCharArray();
		java.util.Arrays.sort(c);
		
		return c[c.length-1];
	}
}

class FindingBiggestCharWithoutForloopTest{
	public static void main(String...abc){
	int i=FindingBiggestCharWithoutForloop.getBiggestCharWithoutForloop("keys2javaselenium");
	System.out.println(i);
	}
}