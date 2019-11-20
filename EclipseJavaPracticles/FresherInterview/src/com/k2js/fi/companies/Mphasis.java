package com.k2js.fi.companies;

import com.k2js.fi.interviewrounds.Qa_round;

public abstract class Mphasis implements Qa_round {

	@Override
	public void qa_round1_Telephonic() {
		System.out.println("Mphasis company_round1_Telephonic 7 outof 10");
	}

	@Override
	public void qa_round2_Technical() {
		System.out.println("Mphasis company_round2_Technical 8 outof 10");
	}

	@Override
	public void qa_round3_domainKnowledge() {
		System.out.println("Mphasis company_round2_domainKnowlwdge on Automotive");
	}

	@Override
	public void communication() {
		System.out.println("Mphasis company_ommunication 500000");

	}
	@Override
	public void database_sql() {
		System.out.println("Sql 8 out of 10");
		
		Qa_round.super.database_sql();
	}

}
