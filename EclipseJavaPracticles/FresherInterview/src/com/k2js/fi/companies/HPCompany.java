package com.k2js.fi.companies;

import com.k2js.fi.interviewrounds.Dev_round;
import com.k2js.fi.interviewrounds.FullStack;
import com.k2js.fi.interviewrounds.Qa_round;
import com.k2js.fi.interviewrounds.UI_round;

public class HPCompany extends EDSCompany implements Qa_round, Dev_round, UI_round, FullStack {

	@Override
	public void devops() {
		System.out.println("Hp company requires 8 out 10 in devops");
	}

	@Override
	public void ui_round1_Telephonic() {
		System.out.println("HP company_round1_Telephonic 8 outof 10");
		
	}

	@Override
	public void ui_round2_ScriptingKnowledge() {
		System.out.println("HP company_round2_ScriptingKnowledge expecting is 7 out of 10");
	}

	@Override
	public void ui_round3_WebDesigning() {
		System.out.println("HP company_round2_WebDesigning expecting is 6 out of 10");
	}

	@Override
	
	public void automation_Qtp() {
       System.out.println(" Hp Company extends knowledge on qtp is 9 outof 10");		
	}

}
