package com.rk.collections.abstraction;

public class BankTest {

	public static void main(String[] args) {
		
		HDFCBank hb=new HDFCBank();
		hb.credit();
		hb.debit();
		hb.insurance();
		Bank b=new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		
		
	
		
		

	}

}
