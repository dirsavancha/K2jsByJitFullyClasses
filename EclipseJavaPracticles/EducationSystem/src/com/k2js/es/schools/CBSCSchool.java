package com.k2js.es.schools;

import com.k2js.es.examnationboard.CBSE;

public class CBSCSchool implements CBSE {
	@Override
	public void examSyllabus() {
		System.out.println(" As per country syllabus ");
	}

	@Override
	public void resultSheet() {
		System.out.println("provides mark sheet and  grades");
	}

	@Override
	public void mediumOfInstructions() {
		System.out.println(" English and Hindi");

	}

	@Override
	public void checkParentsGraduation() {
		System.out.println("should be graduated");

	}

}
