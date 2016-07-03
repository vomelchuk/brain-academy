package com.labs.lab5;

public class A {

	public void calcSquare(double width, double height) {
		System.out.println("Rectangle square with width " + width + ", height "
				+ height + " equal " + width * height);
	}

	public void calcSquare(double side) {
		System.out.println("Foursquare square with side " + side + " equal "
				+ Math.pow(side, 4));
	}

	public void calcSquare(int radius) {
		System.out.println("Circle square with radius " + radius + " equal "
				+ Math.PI * Math.pow(radius, 2));
	}

	public void calcSquareFinal(final int number) {
		// it is not allowed to change final function
		// parameter
		// number = number * number;
		System.out.println("Square of number " + number + " equal " + number);

	}
}
