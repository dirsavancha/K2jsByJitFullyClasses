package com.k2js.usecase.fruitjuice;

public class SaiFruitShop {

	public static void getFruitJuice(String fruitName) {
		Fruit f = null;
		if (fruitName.equalsIgnoreCase("Mango")) {
			// Mango m = new Mango("Mango", "Yellow", "Sweet");
			f = new Mango("Mango", "Yellow", "Sweet");
			System.out.println(f + "Juice is ready");
		} else if (fruitName.equalsIgnoreCase("Chikko")) {
			// Chikko c = new Chikko("Chikko", "Brown", "Sweet");
			f = new Chikko("Chikko", "Brown", "Sweet");
			System.out.println(f + "Juice is ready");
		} else if (fruitName.equalsIgnoreCase("Orange")) {
			f = new Fruit("Orange", "Yelow", "Sour") {
				@Override
				public String toString() {
					return this.fruitName + "\t" + this.fruitTaste;
				}

				@Override
				void showVitamins() {
					System.out.println("C Vitamin");
				}
			};
			if (f != null) {
				f.showVitamins();
				System.out.println(f + "Juice is ready");
			} else {
				System.out.println(fruitName + "is not availabale");
			}

		}

	}

}
