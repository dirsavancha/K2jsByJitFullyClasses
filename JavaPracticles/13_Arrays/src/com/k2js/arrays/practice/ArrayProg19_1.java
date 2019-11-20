// 2nd method

package com.k2js.arrays.practice;

class ArrayProg19_1{
	
	public static int[] evenNum(int[] a){
		int ec=(int)java.util.Arrays.stream(a).filter(x->x%2==0).count();
		int []na =new int[ec];
		int index=0;
		for(int i:a){
			if(i%2==0)
				na[index++]=i;
			
		}
		return na;
	}
}

class ArrayProg19_1Test{
	public static void main(String...abc){
			for(int even:ArrayProg19_1.evenNum(new int[]{5,10,15,16})){
			System.out.println(even);
		}
	}
}