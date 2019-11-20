// Find Length of an array using Enhanced forloop

package com.k2js.twodarray.practice;

class Prog4{
	
	static int[][] i={{10},{15,20,14},{16,17}};
}

class Prog4Test{
	
	public static void main(String...abc){
		System.out.println(Prog4.i.length);
		
		for(int[] i:Prog4.i){
			System.out.println(i.length);
		}
	}
}