package com.rk.collections.abstraction;

public abstract class Bank {
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("I am Credit ");
	}
	public void debit() {
		System.out.println("I am Debit");
	}
	

}
