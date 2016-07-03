package com.labs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.labs.lab1.MyMath;
import com.labs.lab2.Calculation;
import com.labs.lab4.Employee;
import com.labs.lab5.MyCalc;
import com.labs.lab6.GravityCalculator;
import com.labs.lab6.MyPyramid;

public class Lab_2_4 {

	public static void demo() {
		lab2_4_1();
		// lab2_4_2();
		// lab2_4_3();
		// lab2_4_4();
		// lab2_4_5();
		// lab2_4_6();
		// lab2_4_7();
	}

	private static void lab2_4_1() {

		final int SIZE = 10;
		final int START = -100, END = 100;
		int[] array = new int[SIZE];

		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(END - START + 1) + START;
		}

		System.out.println("array = " + Arrays.toString(array));
		System.out.println("MIN = " + MyMath.findMax(array));
		System.out.println("MIN = " + MyMath.findMin(array));

	}

	private static void lab2_4_2() {
		// creating and filling arrays
		final int SIZE = 10;
		final int START = -100, END = 100;

		int[] array1 = new int[SIZE];
		int[] array2 = new int[SIZE];

		Random random = new Random();
		for (int i = 0; i < array1.length; i++) {
			array1[i] = random.nextInt(END - START + 1) + START;
			array2[i] = random.nextInt(END - START + 1) + START;
		}
		// testing Calculation class
		Calculation calc1 = new Calculation(array1);
		Calculation calc2 = new Calculation(array2);
		System.out
				.println("calc1 array = " + Arrays.toString(calc1.getArray()));
		System.out.println("calc1 min = " + calc1.getMin());
		System.out.println("calc1 max = " + calc1.getMax());

		System.out.println();

		System.out
				.println("calc2 array = " + Arrays.toString(calc2.getArray()));
		System.out.println("calc2 min = " + calc2.getMin());
		System.out.println("calc2 max = " + calc2.getMax());

	}

	private static void lab2_4_3() {

		System.out.print("Input radius: ");
		float radius = new Scanner(System.in).nextFloat();
		System.out.println("The area of the circle with RADIUS " + radius
				+ " equal " + MyMath.areaOfCircle(radius));

	}

	private static void lab2_4_4() {

		Employee[] employees = new Employee[3];

		String[] firstNames = { "Vitaliy", "Oleksiy", "Stepan" };
		String[] lastNames = { "Omelchuk", "Kashpurenko", "Dutka" };
		String[] occupations = { "freelancer", "manager", "ingeneour" };
		int[] telephones = { 678743762, 678956784, 506789056 };

		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee(firstNames[i], lastNames[i],
					occupations[i], telephones[i]);
			System.out.println("Employee " + Employee.getNumberOfEmployees()
					+ ":");
			employees[i].display();
		}

	}

	private static void lab2_4_5() {
		System.out.print("Input numbers of step to calculate PI: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("PI = " + MyCalc.calcPi(n));

	}

	private static void lab2_4_6() {
		System.out.print("Input height of pyramid: ");
		int h = new Scanner(System.in).nextInt();
		MyPyramid.printPyramid(h);

	}

	private static void lab2_4_7() {
		System.out.print("Input time (sec): ");
		int time = new Scanner(System.in).nextInt();
		System.out.printf("x(%d sec) = %.2f meters\n", time,
				GravityCalculator.calcDist(time));

	}
}
