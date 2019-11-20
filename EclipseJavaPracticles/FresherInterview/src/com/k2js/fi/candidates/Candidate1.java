package com.k2js.fi.candidates;

import com.k2js.fi.companies.K2JSCompany;

public class Candidate1 {
	public static void main(String[] args) {

		K2JSCompany k2js = new K2JSCompany();
		k2js.qa_round1_Telephonic();
		k2js.qa_round2_Technical();
		k2js.qa_round3_domainKnowledge();
		k2js.communication();
		k2js.database_sql();

	}

}
