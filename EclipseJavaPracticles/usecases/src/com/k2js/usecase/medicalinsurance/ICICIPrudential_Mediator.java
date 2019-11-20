package com.k2js.usecase.medicalinsurance;

public class ICICIPrudential_Mediator extends ICICIPrudential {
	void insurenceMediatorvisitingTimes() {
		System.out.println("Insurence Meditor visits twice per week");
	}

	void empWorkingShifts() {
		System.out.println("Employees are working in flexible timngs");

	}

	@Override
	public boolean verify_EmpId(Company_Employee emp) {

		if (emp.companyName.equalsIgnoreCase("IBM"))
			return true;
		return false;
	}

}
