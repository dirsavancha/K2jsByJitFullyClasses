package com.k2js.usecase.shopping;

public class Customer {

	public static void main(String[] args) {
		StreetShop ss = new StreetShop();
		System.out.println(ss.showroomLocation);
		ss.cardSwipeOption();
		ss.collections();
		ss.shopRegistration();
		ss.discount();
		ss.trailRooms();

		// System.out.println(((BrandFactory)ss).brandName);

		BrandFactory brandf = new StreetShop();
		System.out.println(brandf.showroomLocation);

		brandf.cardSwipeOption();
		brandf.collections();
		brandf.discount();
		brandf.trailRooms();

	}

}
