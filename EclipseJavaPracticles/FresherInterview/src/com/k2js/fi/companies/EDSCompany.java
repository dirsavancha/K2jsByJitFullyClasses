package com.k2js.fi.companies;

import com.k2js.fi.interviewrounds.Dev_round;

public abstract class EDSCompany extends Mphasis implements Dev_round {

	@Override
	public void dev_round1_Telephonic() {
		System.out.println("EDS company_round1_Telephonic 9 outof 10");

	}

	@Override
	public void dev_round2_Programming() {
		System.out.println("EDS company_round2_Programming MainFrames-cCobal 6 out of 10");

	}

	@Override
	public void dev_round3_LogicalSkills() {
		System.out.println("EDS company_round3_LogicalSkills 7 outof 10");
	}

	@Override
	public void communication() {
		System.out.println("EDS company_communication increased to 100000");
	}
	abstract void automation_Qtp();

}
