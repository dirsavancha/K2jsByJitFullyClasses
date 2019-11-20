package com.k2js.usecase.medicalinsurance;

public interface InsuranceCompany {

	boolean verify_EmpId(Company_Employee emp);

	boolean verify_PatientAdhharCard();

	boolean verify_PatientAdmitedDates();

	boolean verify_PatientScanCopies();

	boolean verify_OriginalHospitalBill();

	boolean verify_PatientsPharmacyBills();

	boolean verify_PatientDischargeSumary();

	boolean verify_HospitalRegistrationCertificate();

	boolean verify_PatientCancelledCheck();

}
