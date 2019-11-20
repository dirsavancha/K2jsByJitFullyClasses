package com.k2js.fi.utilconsultancies;

import com.k2js.fi.companies.HPCompany;
import com.k2js.fi.companies.K2JSCompany;
import com.k2js.fi.interviewrounds.Qa_round;

public class FamousCounsultancy {

	public Qa_round getInterviewCall(String companyName) {
		Qa_round qa = null;
		if (companyName.equals("K2JSCompany")) {
			qa = new K2JSCompany();

		} else if (companyName.equalsIgnoreCase("HPCompany")) {
			qa = new HPCompany();
		}
		return qa;
	}

}
