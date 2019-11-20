// Addition of two variables

package com.k2js.aboutmethods.practice; 

class Add{
	public static void add(int i,int j){
		System.out.println("Total:"+(i+j));
	}
}
class AddTest{
	//public static void main(String...abc){
		public static <T extends String> void main(T[]abc){  // writing dynamic in main method
		Add.add(5,6);
	}
}