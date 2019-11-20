package com.k2js.usecase.medicalinsurance;

public class Company_Employee {
	
	String companyName;
	
	public Company_Employee(String companyName) {
		this.companyName = companyName;  
	}

	public static void main(String[] args) {

		Company_Employee emp = new Company_Employee("IBM");

		ICICIPrudential_Mediator emp1 = new ICICIPrudential_Mediator();
		emp1.verify_EmpId(emp);
		emp1.verify_HospitalRegistrationCertificate();
		emp1.verify_OriginalHospitalBill();
		emp1.verify_PatientAdhharCard();
		emp1.verify_PatientAdmitedDates();
		emp1.verify_PatientCancelledCheck();
		emp1.verify_PatientDischargeSumary();
		emp1.verify_PatientScanCopies();
		emp1.verify_PatientsPharmacyBills();
		emp1.empWorkingShifts();
		emp1.insurenceMediatorvisitingTimes();

		ICICIPrudential abc = new ICICIPrudential_Mediator();
		abc.verify_EmpId(emp);
		abc.verify_HospitalRegistrationCertificate();
		abc.verify_OriginalHospitalBill();
		abc.verify_PatientAdhharCard();
		abc.verify_PatientAdmitedDates();
		abc.verify_PatientCancelledCheck();
		abc.verify_PatientScanCopies();
		abc.verify_PatientsPharmacyBills();

	}

}
