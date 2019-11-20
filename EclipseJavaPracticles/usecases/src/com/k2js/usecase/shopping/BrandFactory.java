package com.k2js.usecase.shopping;

abstract public class BrandFactory {

	String showroomLocation="WhiteField - Bangalore";

	void collections() {
		System.out.println("Available all brands for everyone");
	}

	void trailRooms() {
		System.out.println("Trail room is available seperatefor all genders");
	}

	void discount() {
		System.out.println("No discounts available");
	}

	void cardSwipeOption() {
		System.out.println("Card Swiping ia available");
	}

}
