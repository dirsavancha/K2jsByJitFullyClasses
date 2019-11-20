
// 4 method

package com.k2js.arrays.practice;


class ArrayProg19_3{
	
	public static int index=0;
	public static int[] evenNum(int[] a){
		int ec=(int)java.util.Arrays.stream(a).filter(x->x%2==0).count();
		int[] na=new int[ec];
		java.util.Arrays.stream(a).filter(x->x%2==0).forEach(v->na[index++]=v);
		
		return na;
	}

}

class ArrayProg19_2Test{
	
	}
}