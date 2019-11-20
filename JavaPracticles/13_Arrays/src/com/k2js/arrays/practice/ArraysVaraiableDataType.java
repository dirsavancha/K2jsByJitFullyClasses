// var data type in for loop
// var works only for local variables

package com.k2js.arrays.practice;

class VarDataType{
	
	public static void m(int[] n){
		for(var i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
		
	}
}

class varDataTypeTest{
	public static void main(String...abc){
		VarDataType.m(new int[]{10});
	}
}