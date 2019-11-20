package com.k2js.es.schools;

import com.k2js.es.examnationboard.StateBoard;

public class StateBoardSchool implements StateBoard {

	@Override
	public void examSyllabus() {
		System.out.println(" As per state syllabus ");
	}

	@Override
	public void resultSheet() {
		System.out.println("provide marks sheet");
	}

	@Override
	public void mediumOfInstructions() {
		System.out.println("only reginol language instructions");

	}

	@Override
	public void coachingForCompititiveExams() {
		System.out.println("Need extra coaching for compitive exams");
	}

}
