package com.brainacad.oop.testgenerics2;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("Labs 2.14.2:\n");
		lab_2_14_2();
		System.out.println("\n\nLabs 2.14.3:\n");
		lab_2_14_3();

	}

	private static void fillArrays(Integer[] intArray, Double[] doubleArray,
			final int SIZE) {
		final int MIN = 0, MAX = 10;

		Random rand = new Random();
		for (int i = 0; i < SIZE; i++) {
			intArray[i] = rand.nextInt(MAX - MIN + 1) - MIN;
			doubleArray[i] = Math.round(rand.nextDouble() * 100) / 10.0;
		}
	}

	private static void lab_2_14_2() {
		final int SIZE = 10;
		Integer[] intArray = new Integer[SIZE];
		Double[] doubleArray = new Double[SIZE];
		fillArrays(intArray, doubleArray, SIZE);
		Integer maxElem = 4;

		System.out.println("Array values: " + Arrays.toString(intArray));
		System.out.println("Number of elements that are greater than "
				+ maxElem + ":\n" + MyTestMethod.calcNum(intArray, maxElem));

		System.out.println("\nArray values: " + Arrays.toString(doubleArray));
		System.out.println("Number of elements that are greater than "
				+ maxElem + ":\n"
				+ MyTestMethod.calcNum(doubleArray, maxElem.doubleValue()));

	}

	private static void lab_2_14_3() {
		final int SIZE = 10;
		Integer[] intArray = new Integer[SIZE];
		Double[] doubleArray = new Double[SIZE];
		fillArrays(intArray, doubleArray, SIZE);
		Integer maxElem = 8;

		System.out.println("Array values: " + Arrays.toString(intArray));
		System.out.println("Sum of elements that are greater than " + maxElem
				+ ":\n" + MyTestMethod.calcSum(intArray, maxElem).intValue());

		System.out.println("\nArray values: " + Arrays.toString(doubleArray));
		System.out.println("Sum of elements that are greater than " + maxElem
				+ ":\n" + MyTestMethod.calcSum(doubleArray, maxElem));

	}
}
