// 
// How many are divisible by 5 and print the values



package com.k2js.twodarray.practice;

class Prog9{
	
	static int[][] i={{10},{15,20,14},{16,17}};
}

class Prog9Test{
	
	public static void main(String...abc){
		System.out.println(Prog9.i.length);
	
			for(int[] i:Prog9.i){
							
				for( int j:i){
					if(j%5==0)
					System.out.println(j);
					
						
				}
				//System.out.println();
					
			}			
	}
}
