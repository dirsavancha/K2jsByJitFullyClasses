// Find the array which is divisible by 5 an dprint each values i each array
// How many are divisible by 5



package com.k2js.twodarray.practice;

class Prog8{
	
	static int[][] i={{10},{15,20,14},{16,17}};
}

class Prog8Test{
	
	public static void main(String...abc){
		System.out.println(Prog8.i.length);
	
			for(int[] i:Prog8.i){
				int fivemultiple=0;				
				for( int j:i){
					if(j%5==0)
					fivemultiple++;
					
						
				}
				System.out.println(fivemultiple);
					
			}			
	}
}


/*
3
1  in first array one will be done
2 in first array two will be done
0

*/


