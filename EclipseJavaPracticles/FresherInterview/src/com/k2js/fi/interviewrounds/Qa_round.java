package com.k2js.fi.interviewrounds;

public interface Qa_round {

	void qa_round1_Telephonic();

	void qa_round2_Technical();

	void qa_round3_domainKnowledge();

	void communication();
	
	default void database_sql() {
		System.out.println();
	}

}
