package com.k2js.fi.companies;

import com.k2js.fi.interviewrounds.Dev_round;
import com.k2js.fi.interviewrounds.FullStack;
import com.k2js.fi.interviewrounds.Qa_round;
import com.k2js.fi.interviewrounds.UI_round;

public class IBMCompany implements Qa_round, Dev_round, UI_round, FullStack {

	@Override
	public void devops() {
		System.out.println("IBM Company requires 8 outof 10 in devops");
	}

	@Override
	public void ui_round1_Telephonic() {
		System.out.println("IBM Company requires in ui_round1_Telephonic 6 outof 10");
	}

	@Override
	public void ui_round2_ScriptingKnowledge() {
		System.out.println("IBM Company requires in ui_round2_ScriptingKnowledge 7 outof 10");
	}

	@Override
	public void ui_round3_WebDesigning() {
		System.out.println("IBM Company requires in ui_round3_WebDesigning 7 outof 10");

	}

	@Override
	public void dev_round1_Telephonic() {
		System.out.println("IBM Company requires in dev_round1_Telephonic 6 outof 10");
	}

	@Override
	public void dev_round2_Programming() {
		System.out.println("IBM Company requires in dev_round2_Programming 7 outof 10");
	}

	@Override
	public void dev_round3_LogicalSkills() {
		System.out.println("IBM Company requires in dev_round3_LogicalSkills 8 outof 10");
	}

	@Override
	public void qa_round1_Telephonic() {
		System.out.println("IBM Company requires in qa_round1_Telephonic 6 outof 10");
	}

	@Override
	public void qa_round2_Technical() {
		System.out.println("IBM Company requires in qa_round2_Technical 7 outof 10");
	}

	@Override
	public void qa_round3_domainKnowledge() {
		System.out.println("IBM Company requires in qa_round3_domainKnowledge 7 outof 10");
	}

	@Override
	public void communication() {
		System.out.println("IBM Company Communication extends to 100000");
	}

}
