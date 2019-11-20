// if we don't write try catch blocks we want to write throws keyword

package com.k2js.exceptionhandling.practice;

class Prog18{
	
	public static void m() throws InterruptedException{
		System.out.println("Starting Method");
		Thread.sleep(5000);
		System.out.println("Method Ended");
	}
}

class Prog18Test{
	public static void main(String...abc) throws InterruptedException{
		Prog18.m();
	}
}