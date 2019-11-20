
// 3 method

package com.k2js.arrays.practice;

class ArrayProg19_2{
	
	public static Integer[] evenNum(int[] a){
		
		java.util.List<Integer>value=new java.util.ArrayList<>();
			for(int i:a)
			if(i%2==0)value.add(i);
		return value.toArray(new Integer[0]);	
	}

}

class ArrayProg19_2Test{
	public static void main(String...abc){
			for(int even:ArrayProg19_2.evenNum(new int[]{5,10,15,16})){
			System.out.println(even);
		}
	}
}