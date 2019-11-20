//


package com.k2js.twodarray.practice;
import java.util.*;

class Prog10{
	
	static arr[][] i={{10},{15,20,14},{16,17}};
	/*
	
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
		int totalarr=getArrayCount();
		int[][]values=new int[totalarr][];
		int index=0;
		for(int [] i:arr){{
			int fiveMultiple=0;
			for(int t:i){
				if(t%5==0){
					fiveMultiple++;
					
				}
				values[index++]=new int[fiveMultiple];
				int ni=0;
				for(int t:i){
					if(t%5==0){
						values[index][ni++]=t;
					}
				}
				index++;
			}
		}
			
		}
	}
	
	
	*/
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
		allfivemultiples.add(eachArrayFiveMultiples.toArray(new Integer[0]))
		
	}
	
	Integer[][] allValues=allfivemultiples.toArray(new Integer[0][0]);
	System.out.println(Array.deepToString(allValues);
}

class Prog10Test{
	
	public static void main(String...abc){
		Prog10.store();
	
	}
}