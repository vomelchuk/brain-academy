package com.brainacad.oop.testshapes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Shape implements Drawable {

	// fields
	private String shapeColor;

	// constructors
	protected Shape(String shapeColor) {
		this.shapeColor = shapeColor;
	}

	// methods
	public abstract double calcArea();

	public static Shape parseShape(String str)
			throws InvalidShapeStringException {
		final String RECTANGLE = "Rectangle", CIRCLE = "Circle", TRIANGLE = "Triangle";
		if (str.indexOf(':') < 0) {
			throw new InvalidShapeStringException("Shape was not given!");
		}
		String shapeKind = str.substring(0, str.indexOf(":")).trim();
		/*
		 * String color = str.substring(str.indexOf(":") + 1,
		 * str.lastIndexOf(":"));
		 */
		switch (shapeKind) {
		case RECTANGLE:
			checkColor(str);
			if (!checkParameters(str, "[0-9]+[.]?[0-9]*[,]?[0-9]+[.]?[0-9]*")) {
				throw new InvalidShapeStringException(
						"Wrong parameters for rectangle!");
			}
			/*
			 * double w = Double.parseDouble(str.substring( str.lastIndexOf(":")
			 * + 1, str.indexOf(","))); double h = Double
			 * .parseDouble(str.substring(str.lastIndexOf(",") + 1)); return new
			 * Rectangle(color, w, h);
			 */
			return Rectangle.parseRectangle(str);
		case CIRCLE:
			checkColor(str);
			if (!checkParameters(str, "[0-9]+[.]?[0-9]*")) {
				throw new InvalidShapeStringException(
						"Wrong parameters for circle!");
			}
			/*
			 * double r = Double .parseDouble(str.substring(str.lastIndexOf(":")
			 * + 1)); return new Circle(color, r);
			 */
			return Circle.parseCircle(str);
		case TRIANGLE:
			checkColor(str);
			if (!checkParameters(str,
					"[0-9]+[.]?[0-9]*[,]?[0-9]+[.]?[0-9]*[,]?[0-9]+[.]?[0-9]*")) {
				throw new InvalidShapeStringException(
						"Wrong parameters for circle!");
			}
			/*
			 * double a = Double.parseDouble(str.substring( str.lastIndexOf(":")
			 * + 1, str.indexOf(","))); double b =
			 * Double.parseDouble(str.substring(str.indexOf(",") + 1,
			 * str.lastIndexOf(","))); double c = Double
			 * .parseDouble(str.substring(str.lastIndexOf(",") + 1)); return new
			 * Triangle(color, a, b, c);
			 */
			return Triangle.parseTriangle(str);
		default:
			throw new InvalidShapeStringException("Wrong shape name!");
		}
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

	// private methods
	private static void checkColor(String str)
			throws InvalidShapeStringException {
		if (str.indexOf(":") == str.lastIndexOf(":")) {
			throw new InvalidShapeStringException("Wrong shape color!");
		}
	}

	private static boolean checkParameters(String parameterString,
			String template) {
		Pattern pattern = Pattern.compile(template);
		Matcher matcher = pattern.matcher(parameterString
				.substring(parameterString.lastIndexOf(":") + 1));
		return matcher.matches();
	}

}
