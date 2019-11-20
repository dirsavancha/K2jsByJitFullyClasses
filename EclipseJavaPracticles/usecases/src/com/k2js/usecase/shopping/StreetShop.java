package com.k2js.usecase.shopping;

public class StreetShop extends BrandFactory {
	String showroomLocation = "Shivaji Nagar - Bangalore";

	void shopRegistration() {
		System.out.println("Not registered by indian govt");
	}
	

	@Override
	void discount() {
		super.discount();
		System.out.println("10% discount avaialble ");
	}

}
