package com.k2js.usecase.fruitjuice;

public class Mango extends Fruit {

	public Mango(String fruitName, String fruitColour, String fruitTaste) {
		super(fruitName, fruitColour, fruitTaste);
	}

	public Mango(String fruitName, String fruitColour) {
		super(fruitName, fruitColour);
	}

	@Override
	void showVitamins() {
		System.out.println("D Vitamin");
	}

}
