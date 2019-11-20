// Both are enhanced forloop

package com.k2js.twodarray.practice;

class Prog7{
	
	static int[][] i={{10},{15,20,14},{16,17}};
}

class Prog7Test{
	
	public static void main(String...abc){
		System.out.println(Prog7.i.length);
	
			for(int[] i:Prog7.i){
					
				for(int j:i){
					System.out.println(j);
						
				}
					
			}			
	}
}
