package com.brainacad.oop.testshapes;

public class Circle extends Shape implements Comparable {
	// fields
	private double radius;

	// constructors
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	// methods
	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return String.format("%s: color = %s, radius = %.2f", getClass()
				.getSimpleName(), this.getShapeColor(), radius);
	}

	public int compareTo(Object o) {
		Circle circle = (Circle) o;
		return this.calcArea() > circle.calcArea() ? 1
				: this.calcArea() == circle.calcArea() ? 0 : -1;
	}

}
