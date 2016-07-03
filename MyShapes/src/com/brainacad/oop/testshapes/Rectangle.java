package com.brainacad.oop.testshapes;

public class Rectangle extends Shape implements Comparable {

	// fields
	private double width;
	private double height;

	// constructors
	public Rectangle(String shapeColor, double width, double height) {
		super(shapeColor);
		this.width = width;
		this.height = height;
	}

	// methods
	@Override
	public double calcArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return String
				.format("%s: color = %s, width = %.2f, height = %.2f",
						getClass().getSimpleName(), this.getShapeColor(),
						width, height);
	}

	public int compareTo(Object o) {
		Rectangle rect = (Rectangle) o;
		return this.calcArea() > rect.calcArea() ? 1 : this.calcArea() == rect
				.calcArea() ? 0 : -1;
	}

}
