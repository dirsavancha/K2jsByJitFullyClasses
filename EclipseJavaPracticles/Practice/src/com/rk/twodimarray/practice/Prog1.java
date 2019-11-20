package com.rk.twodimarray.practice;

public class Prog1 {
	static int [][] i= {{10},{30,40,50},{60,70}};
	public static void main(String[] args) {
		
		System.out.println("Total Length of an array"+Prog1.i.length); // 3
		System.out.println("Length of index 0 is "+Prog1.i[0].length);//1
		System.out.println("Length of index 1 is "+Prog1.i[1].length);//3
		System.out.println("Length of index 1 is "+Prog1.i[2].length);//2
		// Or
		
		for(int i=0;i<=Prog1.i.length-1;i++) {
			System.out.println("value"+i);
			int len=Prog1.i[i].length;
			System.out.println(len);
		}
		
		// enhance forloop
		for(int[] arr:Prog1.i) {
			int k=arr.length;
			System.out.println("Enhanced forloop"+k);
		}
		// finding each elements in an single array {},{},{}
		for(int i=0;i<Prog1.i.length;i++) {
			int[] eacharray=Prog1.i[i];
			for(int j:eacharray) {
				System.out.println(j);
			}
			
		}
		//or
		for(int [] eacharr:Prog1.i) {
			for(int j:eacharr) {
				System.out.println("---------");
				System.out.println(j);
			}
		}
		
	}

}
