package com.k2js.es.schools;

import com.k2js.es.examnationboard.CISCE;

public abstract class CISCESchool implements CISCE {

	@Override
	public void entranceTest() {
		System.out.println("should pass the test to get the admission");
	}

	@Override
	public void examSyllabus() {
		System.out.println("exam Syllabus is as per Internationl standards");
	}

	@Override
	public void resultSheet() {
		System.out.println("Result Sheet is only Grading system");
	}

	@Override
	public void mediumOfInstructions() {
		System.out.println("Medium of instruction is only in Engish");
	}

	public abstract void trainingMethodology();

}
