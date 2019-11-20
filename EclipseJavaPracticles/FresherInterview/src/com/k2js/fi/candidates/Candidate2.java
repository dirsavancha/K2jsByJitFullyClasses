package com.k2js.fi.candidates;

import com.k2js.fi.companies.HPCompany;
import com.k2js.fi.interviewrounds.Qa_round;

public class Candidate2 {
	public static void main(String[] args) {
		Qa_round hpqa=new HPCompany();
		
				hpqa.qa_round1_Telephonic();
				hpqa.qa_round2_Technical();
				hpqa.qa_round3_domainKnowledge();
				hpqa.communication();
				((HPCompany)hpqa).automation_Qtp();
				hpqa.database_sql();
			
				
				
	}

}
