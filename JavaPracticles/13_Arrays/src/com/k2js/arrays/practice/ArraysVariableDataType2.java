//

package com.k2js.arrays.practice;

class VarDataType2{
	public static void m(int[] n){
		var v=new int[]{10,20};
		
		for(int i=0;i<v.length;i++){
			System.out.println(n[i]);
			
		}
		
	}
}

class VarDataType2Test{
	public static void main(String...abc){
		VarDataType2.m();
	}
}