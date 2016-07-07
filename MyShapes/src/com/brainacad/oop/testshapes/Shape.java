package com.brainacad.oop.testshapes;

import java.util.StringTokenizer;

public abstract class Shape implements Drawable {

	// fields
	private String shapeColor;

	// constructors
	protected Shape(String shapeColor) {
		this.shapeColor = shapeColor;
	}

	// methods
	public abstract double calcArea();

	public static Shape parseShape(String str) {
		String shapeKind = str.substring(0, str.indexOf(":"));
		/*
		 * String color = str.substring(str.indexOf(":") + 1,
		 * str.lastIndexOf(":"));
		 */
		switch (shapeKind) {
		case "Rectangle":
			/*
			 * double w = Double.parseDouble(str.substring( str.lastIndexOf(":")
			 * + 1, str.indexOf(","))); double h = Double
			 * .parseDouble(str.substring(str.lastIndexOf(",") + 1)); return new
			 * Rectangle(color, w, h);
			 */
			return Rectangle.parseRectangle(str);
		case "Circle":
			/*
			 * double r = Double .parseDouble(str.substring(str.lastIndexOf(":")
			 * + 1)); return new Circle(color, r);
			 */
			return Circle.parseCircle(str);
		case "Triangle":
			/*
			 * double a = Double.parseDouble(str.substring( str.lastIndexOf(":")
			 * + 1, str.indexOf(","))); double b =
			 * Double.parseDouble(str.substring(str.indexOf(",") + 1,
			 * str.lastIndexOf(","))); double c = Double
			 * .parseDouble(str.substring(str.lastIndexOf(",") + 1)); return new
			 * Triangle(color, a, b, c);
			 */
			return Triangle.parseTriangle(str);
		}
		return null;
	}

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
