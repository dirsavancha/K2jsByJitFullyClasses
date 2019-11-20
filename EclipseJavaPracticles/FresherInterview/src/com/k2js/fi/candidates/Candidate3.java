package com.k2js.fi.candidates;

import com.k2js.fi.companies.HPCompany;
import com.k2js.fi.companies.K2JSCompany;
import com.k2js.fi.utilconsultancies.K2JSConsultancy;

public class Candidate3 {
	public static void main(String[] args) {

		HPCompany hp = new HPCompany();
		K2JSConsultancy.conductInterview(hp);

		K2JSCompany k2js = new K2JSCompany();
		K2JSConsultancy.conductInterview(k2js);

	}

}
