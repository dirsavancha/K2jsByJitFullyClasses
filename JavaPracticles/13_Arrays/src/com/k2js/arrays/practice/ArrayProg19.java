// Store all even number in an array

package com.k2js.arrays.practice;

class ArrayProg19{
	
	public static int[] evenNum(int[] a){
		
		// 1.get even number count
		int l=0;
		int val=0;
		for(int i:a) l=(i%2==0)?++l:l;
		
		//2.create an array with length
		int[] na=new int[l];
		
		//3.create index variable
		int index=0;
		
		//4.write to store even numbers in an array
		for(int i:a){
			if(i%2==0)
				na[index++]=i;
			
		}	
	return na;
	}
}

class ArrayProg19Test{
	public static void main(String...abc){
		for(int even:ArrayProg19.evenNum(new int[]{5,10,15,16})){
			System.out.println(even);
		}
		
	}
}


/*
instead of the forloop
1. Method
int ec=(int)java.util.Arrays.Stream(a).filter(x->x%2==0).count(); // x is nothing but every value of an array
int []na =new int[ec];

2. method using collections
java.util.list<Integer>value=new ArrayList<>();
 for(int i:a)
	 if(i%2==0)value.add(i);
 return value.toArray(new int[0]);
 
 3. method
 public static int index=0;
 public static int[] evenNum(int[] a){
	 int ec=java.util.Arrays.Stream(a).filter(x->x%2==0).count();
	 int[]na=new int[ec];
	 java.util.Arrays.Stream(a).filter(x->x%2==0).foreach(v->na[index++]=v);
	 return na;
 }
*/