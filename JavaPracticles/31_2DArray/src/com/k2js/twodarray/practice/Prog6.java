//Both normal for loops

package com.k2js.twodarray.practice;

class Prog6{
	
	static int[][] i={{10},{15,20,14},{16,17}};
}

class Prog6Test{
	
	public static void main(String...abc){
		System.out.println(Prog6.i.length);
	
				for(int i=0;i<Prog6.i.length;i++){
					int[] eacharray=Prog6.i[i];
					for(int j=0;j< eacharray.length;j++){
						System.out.println(eacharray[i]);
						
					}
					
				}			
	}
}