package com.k2js.fi.companies;

import com.k2js.fi.interviewrounds.Qa_round;

public class K2JSCompany implements Qa_round {

	@Override
	public void qa_round1_Telephonic() {
		System.out.println("K2js company round_1 Telephonic 6 outof10");

	}

	@Override
	public void qa_round2_Technical() {
		System.out.println("K2js company_round2_Technical 7 outof 10");
	}

	@Override
	public void qa_round3_domainKnowledge() {
		System.out.println("K2js company_round3_DomainKNowledge BSFI");
	}

	@Override
	public void communication() {
		System.out.println("K2js company_communication maximum 400000");
	}

}
