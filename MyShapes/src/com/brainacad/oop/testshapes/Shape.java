package com.brainacad.oop.testshapes;

public abstract class Shape implements Drawable {

	// fields
	private String shapeColor;

	// constructors
	protected Shape(String shapeColor) {
		this.shapeColor = shapeColor;
	}

	// methods
	public abstract double calcArea();

	public String toString() {
		return getClass().getSimpleName() + ": color = " + shapeColor;
	}

	public void draw() {
		System.out.printf("%s, area is %.2f\n", this.toString(),
				this.calcArea());

	}

	// accessors
	public String getShapeColor() {
		return shapeColor;
	}

}
