package com.k2js.usecase.medicalinsurance;

public abstract class ICICIPrudential implements InsuranceCompany {

	

	@Override
	public boolean verify_PatientAdhharCard() {
		System.out.println("Employee Addhar is Valid");
		return true;
	}

	@Override
	public boolean verify_PatientAdmitedDates() {
		System.out.println("Patient Admited dates are verified and submitted");
		return true;
	}

	@Override
	public boolean verify_PatientScanCopies() {
		System.out.println("Scan ccopies are verified and submitted");
		return true;
	}

	@Override
	public boolean verify_OriginalHospitalBill() {
		System.out.println("Original bills are verified and submitted");
		return true;
	}

	@Override
	public boolean verify_PatientsPharmacyBills() {
		System.out.println("Pharmacy bills are verified and submitted");
		return true;
	}

	@Override
	public boolean verify_PatientDischargeSumary() {
		System.out.println("Discharge summary verified and submitted");
		return true;
	}

	@Override
	public boolean verify_HospitalRegistrationCertificate() {
		System.out.println("Hospital Registration is verified and submitted");
		return true;
	}

	@Override
	public boolean verify_PatientCancelledCheck() {
		System.out.println("Patient cancelled check submitted");
		return false;
	}

	abstract void empWorkingShifts();

}
