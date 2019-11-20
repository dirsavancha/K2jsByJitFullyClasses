//


package com.k2js.twodarray.practice;
import java.util.*;

class Prog11{
	
	static int[][] arr ={{10},{15,20,14},{16,17}};
	
	
	public static int getArrayCount(){
		int arraCount=0;
		for(int[] i:arr){
			int fiveMultiple=0;
			for(int t:i){
				if(t%5==0){
					fiveMultiple++;
					break;
				}
			}
			arraCount++;
		}
		return arraCount;
	}
	 public static void store(){
	
	List<Integer []> allfivemultiples=new ArrayList<>();
	for(int[] i:arr){
		List<Integer> eachArrayFiveMultiples=new ArrayList<>();
		for(int t:i){
			if(t%5==0){
				eachArrayFiveMultiples.add(t);
			}
			
		}
		allfivemultiples.add(eachArrayFiveMultiples.toArray(new Integer[0]));
		
	}
	
	Integer[][] allValues=allfivemultiples.toArray(new Integer[0][0]);
	System.out.println(Arrays.deepToString(allValues));
}
	
}



class Prog11Test{
	
	public static void main(String...abc){
		Prog11.store();
	
	}
}