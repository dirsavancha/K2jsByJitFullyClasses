// Why do we need upcasting
// Annonymous class
// Overriding

package com.k2js.usecase.fruitjuice;

abstract public  class Fruit {
	String fruitName, fruitColour, fruitTaste;

	public Fruit(String fruitName, String fruitColour) {
		super();
		this.fruitName = fruitName;
		this.fruitColour = fruitColour;
	}

	public Fruit(String fruitName, String fruitColour, String fruitTaste) {

		this(fruitName, fruitColour);
		this.fruitTaste = fruitTaste;
	}

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitColour=" + fruitColour + ", fruitTaste=" + fruitTaste + "]";
	}

	abstract void showVitamins();

}
