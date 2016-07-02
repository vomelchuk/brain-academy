package com.brainacad.shapes;

import static java.lang.Math.sqrt;

public class Triangle {
	// fields
	private double a, b, c;
	// initialization block
	{
		a = b = c = 1.0;
	}

	// constructors
	public Triangle() {

	}

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// accessors
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	// methods
	public double getArea() {
		double s = (a + b + c) / 2.0;
		return sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
