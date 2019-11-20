package com.k2js.fi.candidates;

import com.k2js.fi.companies.HPCompany;
import com.k2js.fi.interviewrounds.Qa_round;
import com.k2js.fi.utilconsultancies.FamousCounsultancy;

public class Candidate4 {

	public static void main(String[] args) {
		Qa_round qa1=new HPCompany();
		
		qa1.qa_round1_Telephonic();
		qa1.qa_round2_Technical();
		qa1.qa_round3_domainKnowledge();
		qa1.communication();
		((HPCompany)qa1).automation_Qtp();// In Line upcasting
	}
}
