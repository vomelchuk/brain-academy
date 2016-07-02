package com.brainacad.calc;

import java.util.Scanner;
import com.brainacad.shapes.Triangle;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Input sides of thr triangle:");
		System.out.print("a = ");
		double a = scan.nextDouble();
		System.out.print("b = ");
		double b = scan.nextDouble();
		System.out.print("c = ");
		double c = scan.nextDouble();

		Triangle defaultTriangle = new Triangle();
		Triangle triangle = new Triangle(a, b, c);
		System.out.printf(
				"Triangle square with (a=%.2f, b=%.2f, c=%.2f) equal %.2f%n",
				a, b, c, triangle.getArea());
		System.out.printf(
				"Triangle square with (a=%.2f, b=%.2f, c=%.2f) equal %.2f%n",
				defaultTriangle.getA(), defaultTriangle.getB(),
				defaultTriangle.getC(), defaultTriangle.getArea());
	}
}
