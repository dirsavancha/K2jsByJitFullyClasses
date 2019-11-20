package com.k2js.fi.utilconsultancies;

import com.k2js.fi.companies.HPCompany;
import com.k2js.fi.interviewrounds.Qa_round;

public class K2JSConsultancy {
	
	public static void conductInterview(Qa_round qa) {
		qa.qa_round1_Telephonic();
		qa.qa_round2_Technical();
		qa.qa_round3_domainKnowledge();
		qa.communication();
		if(qa instanceof HPCompany) {
			((HPCompany)qa).automation_Qtp();
		}
		
	}

}
 