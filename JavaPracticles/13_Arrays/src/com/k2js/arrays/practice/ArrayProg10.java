// Find the Smallest value in an array using covarience and Runtime polymorphism

package com.k2js.arrays.practice;

class ArrayProg10{
	public static int minValue(Object[] n){
		
		int min=(int)n[0];  // int min=(Integer)n[0];
		for(Object o:n){
			if(min>(int)o){   //unboxing
				min=(int)o; // min=((Number)o).intValue(); Runtime Polymorphysim
			}
		}
		return min;
	}
}

class ArrayProg10Test{
	public static void main(String...abc){
		Integer smallnum=ArrayProg10.minValue(new Integer[]{10,5,15,25});
		System.out.println("Minum value is "+smallnum);
	
	}
}

