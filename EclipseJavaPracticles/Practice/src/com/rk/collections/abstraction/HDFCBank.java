package com.rk.collections.abstraction;

public class HDFCBank extends Bank {
	@Override
	public void loan() {
		System.out.println("I am HDFC Loan");
	}
	public void credit() {
		System.out.println("I am HDFC Credit");
	}
	public void insurance() {
		System.out.println("Ia ma HDFC insurance");
	}

}
