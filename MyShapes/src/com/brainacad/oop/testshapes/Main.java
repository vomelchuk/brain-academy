package com.brainacad.oop.testshapes;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("Labs 2.7.6 - 2.7.9:\n");
		lab_2_7_6_through_2_7_9();
		System.out.println("\n\nLabs 2.7.10:\n");
		lab_2_7_10();
		System.out.println("\n\nLabs 2.8.1 - 2.8.2:\n");
		lab_2_8_1_and_2_8_2();
		System.out.println("\n\nLabs 2.8.3:\n");
		lab_2_8_3();
		System.out.println("\n\nLabs 2.8.4:\n");
		lab_2_8_4();

	}

	public static void lab_2_7_6_through_2_7_9() {
		// Shape shape = new Shape("GREEN");
		// System.out.println(shape);
		// System.out.println("Shape area is: " + shape.calcArea());

		// System.out.println();

		Circle circle = new Circle("BLUE", 1.5);
		System.out.println(circle);
		System.out.printf("Shape area is: %.3f%n", circle.calcArea());

		System.out.println();

		Rectangle rect = new Rectangle("GREY", 25, 56);
		System.out.println(rect);
		System.out.printf("Shape area is: %.3f%n", rect.calcArea());

		System.out.println();

		Triangle trian = new Triangle("GREY", 5, 5, 5);
		System.out.println(trian);
		System.out.printf("Shape area is: %.3f%n", trian.calcArea());
	}

	private static void lab_2_7_10() {

		Shape[] shapes = new Shape[9];

		String[] colors = { "WHITE", "RED", "BLUE", "GREEN", "YELLOW",
				"MAGENTA", "GREY", "BLACK", "PURPLE" };
		double[] widthRects = { 11, 15, 17, 9, 8 };
		double[] heightRects = { 25, 6, 15, 23, 45 };
		double[] sideAtriangles = { 10, 15 };
		double[] sideBtriangles = { 18, 23 };
		double[] sideCtriangles = { 15, 32 };
		double[] radiuses = { 15, 25 };

		for (int i = 0; i < shapes.length; i++) {
			// Rectangle
			if (i < 5) {
				shapes[i] = new Rectangle(colors[i], widthRects[i],
						heightRects[i]);
			}
			// Circle
			if (i >= 5 && i <= 6) {
				shapes[i] = new Circle(colors[i], radiuses[i - 5]);
			}
			// Triangle
			if (i > 6) {
				shapes[i] = new Triangle(colors[i], sideAtriangles[i - 7],
						sideBtriangles[i - 7], sideCtriangles[i - 7]);
			}
		}
		// these variables accumulate sum of corresponding type
		double sumArea, sumRectArea, sumTriangleArea, sumCircleArea;
		sumArea = sumRectArea = sumTriangleArea = sumCircleArea = 0;
		// iterate array of shapes to show their charactristics and evaluate
		// corresponding sums
		for (Shape shape : shapes) {
			// characteristics of current shape
			System.out.println(shape);
			double area = shape.calcArea();
			System.out.printf("Shape area is: %.3f%n%n", area);
			// evaluating sums
			sumArea += area;
			if (shape instanceof Rectangle) {
				sumRectArea += area;
			}
			if (shape instanceof Circle) {
				sumCircleArea += area;
			}
			if (shape instanceof Triangle) {
				sumTriangleArea += area;
			}
		}
		// show corresponding sums
		System.out.printf("Shapes total area: %.2f\n", sumArea);
		System.out
				.printf("Rectangle total area: %.2f\nCircle total area: %.2f\nTriangle total area: %.2f\n",
						sumRectArea, sumCircleArea, sumTriangleArea);

	}

	private static void lab_2_8_1_and_2_8_2() {

		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle("RED", 11, 22);
		shapes[1] = new Circle("GREEN", 10);
		shapes[2] = new Triangle("BLACK", 5, 5, 5);

		for (Shape shape : shapes) {
			shape.draw();
		}
	}

	private static void lab_2_8_3() {
		Rectangle rect1 = new Rectangle("BLACK", 10, 20);
		Rectangle rect2 = new Rectangle("BLACK", 10, 25);
		Rectangle rect3 = new Rectangle("RED", 10, 20);
		System.out.println("rect1 area = " + rect1.calcArea()
				+ "\nrect2 area = " + rect2.calcArea() + "\nrect3 area = "
				+ rect3.calcArea());
		System.out
				.println("rect1.compareTo(rect2) = " + rect1.compareTo(rect2));
		System.out
				.println("rect1.compareTo(rect3) = " + rect1.compareTo(rect3));
		System.out
				.println("rect2.compareTo(rect3) = " + rect2.compareTo(rect3));
	}

	private static void lab_2_8_4() {
		Rectangle[] rects = new Rectangle[6];
		String[] colors = { "RED", "GREEN", "BLUE", "WHITE", "BLACK", "YELLOW" };
		double[] widths = { 15, 5, 45, 35, 87, 4 };
		double[] heights = { 23, 8, 34, 56, 23, 16 };

		for (int i = 0; i < rects.length; i++) {
			rects[i] = new Rectangle(colors[i], widths[i], heights[i]);
		}

		System.out.println("Before sorting:");
		for (Rectangle rect : rects) {
			rect.draw();
		}

		Arrays.sort(rects);

		System.out.println("\nAfter sorting:");
		for (Rectangle rect : rects) {
			rect.draw();
		}

	}

}
