// Find the total sum of the values

package com.k2js.arrays.practice;

class ArrayProg11{
	
	public static int sum(Object o){
		int total=0;
		
		for(Integer t:(Integer[])o){
			total +=t;
		}
		return total;
	}
}

class ArrayProg11Test{
	
	public static void main(String...abc){
		Integer total=ArrayProg11.sum(new Integer[]{10,5,15,25});
		System.out.println("Sum of Value is" +total);
	}
	
}