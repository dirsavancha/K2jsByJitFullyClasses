package com.k2js.usecase.fruitjuice;

public class Chikko extends Fruit {

	public Chikko(String fruitName, String fruitColour) {
		super(fruitName, fruitColour);
	}

	public Chikko(String fruitName, String fruitColour, String fruitTaste) {
		super(fruitName, fruitColour, fruitTaste);
	}

	@Override
	void showVitamins() {
		System.out.println("E Vitamin");
	}

}
