package com.k2js.es.students;

import com.k2js.es.examnationboard.EducationPattern;
import com.k2js.es.examnationboard.StateBoard;
import com.k2js.es.schools.StateBoardSchool;
import com.k2js.es.schools.CBSCSchool;
import com.k2js.es.schools.CISCESchool;
import com.k2js.es.schools.CISCESchoolBranch;

public class Student_3 {
	public static EducationPattern searchSchool(String schoolBoard) {
		EducationPattern ep = null;
		if (schoolBoard.equals("StateBoard")) {
			ep = new StateBoardSchool();
		} else if (schoolBoard.equalsIgnoreCase("CISCE")) {
			ep = new CISCESchoolBranch();

		} else if (schoolBoard.equalsIgnoreCase("CBSE")) {
			ep = new CBSCSchool();

		}
		return ep;

	}

	public static void main(String[] args) {
		EducationPattern ed = Student_3.searchSchool("CISCE");
		ed.examSyllabus();
		ed.mediumOfInstructions();
		ed.resultSheet();
		((CISCESchoolBranch) ed).trainingMethodology();
		((CISCESchool) ed).entranceTest();
	}
}
