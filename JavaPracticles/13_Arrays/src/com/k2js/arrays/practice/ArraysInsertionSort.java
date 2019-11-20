// Insertion SortedMap

package com.k2js.arrays.practice;

class ArraysInsertionSort{
	
	public static void insertionSort(int[] a){
		System.out.println("Given values are"+java.util.Arrays.toString(a));
		for(int i=0;i<a.length-1;i++){
			int smallestposition=i;
			int smallestvalue=a[i];
			for(int j=i;j<a.length;j++){
				if(smallestvalue>a[j]){
					smallestvalue=a[j];
					smallestposition=j;
					
				}
			}
			int t=a[i];
			a[i]=smallestvalue;
			a[smallestposition]=t;
			
		}
		System.out.println("Final O/P values are"+java.util.Arrays.toString(a));
	}
}

class ArraysInsertionSortTest{
	public static void main(String...abc){
		
		ArraysInsertionSort.insertionSort(new int[] {12,5,6,17,4,3});
		
	}
	
		
}