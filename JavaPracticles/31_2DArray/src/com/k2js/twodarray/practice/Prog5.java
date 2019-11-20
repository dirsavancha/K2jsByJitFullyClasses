//

package com.k2js.twodarray.practice;

class Prog5{
	
	static int[][] i={{10},{15,20,14},{16,17}};
}

class Prog5Test{
	
	public static void main(String...abc){
		System.out.println(Prog5.i.length);
		
		for(int i=0;i<Prog5.i.length;i++){
			int[] eacharray=Prog5.i[i];
			for(int j: eacharray){
				System.out.println(j);
				/*// or
				for(int[] i:Prog5.i){
					for(int j=0;j<i.length;j++){
						System.out.println(i[j]);
						
					}
					
				}
				*/
			}
		}
	}
}