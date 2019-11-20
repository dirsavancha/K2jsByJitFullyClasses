// Find Length of an array using forloop

package com.k2js.twodarray.practice;

class Prog3{
	
	static int[][] i={{10},{15,20},{16,17}};
}

class Prog3Test{
	
	public static void main(String...abc){
		System.out.println(Prog3.i.length);
		
		for(int i=0;i<Prog3.i.length;i++){
			System.out.println(Prog3.i[i].length);
		}
	}
}