// Adding all Values in an 1Darray

package com.k2js.twodarray.practice;

class Prog1{
	
	static Object o=new Object[]{10,new int[]{20},new Object[]{30,40}};
	
	public void sum(){
		int sum=0;
		for(Object o:(Object[])Prog1.o){
			if(o instanceof Integer){
				sum+=(int)o;
			}
			else if(o instanceof int[]){
				for(int i:(int[])o){
					sum+=i;
				}
			}
			else if(o instanceof Object[]){
				for(Object o1:(Object[])o)
					sum+=(int)o1;
			}
		}
		System.out.println(sum);
		
		
	}
}

class Prog1Test{
	public static void main(String...abc){
		Prog1 p=new Prog1();
		p.sum();
		
	}
}
