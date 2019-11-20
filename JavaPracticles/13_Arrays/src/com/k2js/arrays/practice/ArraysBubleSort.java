// BubbleSort

package com.k2js.arrays.practice;

class ArrayBubbleSort{
	
	public static void sort(int[] a){
		System.out.println(java.util.Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			    System.out.println(java.util.Arrays.toString(a)); // To check the internal patter
			}
			System.out.println("-----------------------");
		}
		System.out.println(java.util.Arrays.toString(a));
	}
}

class ArrayBubbleSortTest{
	public static void main(String...abc){
		ArrayBubbleSort.sort(new int[]{12,5,6,17,4,3});
	}
}