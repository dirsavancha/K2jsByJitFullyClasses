package com.rk.practice.javaexamples;

class Bank{
	public void intrestRate() {
		System.out.println("Bank Intrest Rate");
	}
	
}
class HDFCBank extends Bank{
	@Override
	public void intrestRate() {
		System.out.println("HDFC BAnk Intrest Rate");
	}
	public void loan() {
		System.out.println("HDFC Loan SEction");
	}
}
public class Test {
public static void main(String[] args) {
	Bank b=new HDFCBank();
	
	
	HDFCBank h=new HDFCBank();
	h.intrestRate();
	h.loan();
	}

}
