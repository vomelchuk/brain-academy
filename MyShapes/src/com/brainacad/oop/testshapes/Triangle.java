package com.brainacad.oop.testshapes;

public class Triangle extends Shape implements Comparable {
	// fields
	private double a;
	private double b;
	private double c;

	// constructors
	public Triangle(String shapeColor, double a, double b, double c) {
		super(shapeColor);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// methods
	@Override
	public double calcArea() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public String toString() {
		return String.format("%s: color = %s, a = %.2f, b = %.2f, c = %.2f",
				getClass().getSimpleName(), this.getShapeColor(), a, b, c);
	}

	public int compareTo(Object o) {
		Triangle tria = (Triangle) o;
		return this.calcArea() > tria.calcArea() ? 1 : this.calcArea() == tria
				.calcArea() ? 0 : -1;
	}

}
