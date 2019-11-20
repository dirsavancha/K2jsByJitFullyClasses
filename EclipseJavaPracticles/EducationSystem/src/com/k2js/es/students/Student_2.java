package com.k2js.es.students;

import com.k2js.es.examnationboard.CISCE;
import com.k2js.es.schools.CISCESchoolBranch;

public class Student_2 {
	public static void main(String[] args) {
		CISCE cise = new CISCESchoolBranch();
		cise.entranceTest();
		cise.examSyllabus();
		cise.mediumOfInstructions();
		cise.resultSheet();
		cise.entranceTest();
		((CISCESchoolBranch) cise).trainingMethodology();
	}

}
