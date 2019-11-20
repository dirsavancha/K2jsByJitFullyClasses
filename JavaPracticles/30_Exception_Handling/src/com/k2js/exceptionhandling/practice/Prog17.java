// Checked Exception
// Thread.sleep means  it will halt the CPU time for a give time.



package com.k2js.exceptionhandling.practice;

class Prog17{
	
	public static void  m(){ 
		System.out.println("Method Started");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		System.out.println("Method Ended");
	}
}


class Prog17Test{
	
	public static void main(String...abc) {
		Prog17.m();
	}
}