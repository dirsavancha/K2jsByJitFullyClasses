// Find the biggest value in an array using covarience and Runtime polymorphism

package com.k2js.arrays.practice;

class ArrayProg9{
	public static int maxValue(Number[] n){
		
		int max=0;
		for(Number t:n){
			if(max<t.intValue()){ //runtime polymorphism  // (int)t....max=t;
				max=t.intValue();
			}
		}
		return max;
	}
}

class ArrayProg9Test{
	public static void main(String...abc){
		Integer maxvalue=ArrayProg9.maxValue(Integer[]{10,5,15,25});
		//Integer bignum=maxValue(new Integer[]{10,5,15,25});
		//System.out.println(bignum);
		System.out.println(maxValue);
		
	}
	
}