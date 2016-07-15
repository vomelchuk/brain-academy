package com.brainacad.oop.testgenerics2;

public class MyTestMethod<T> {

	public static <T extends Comparable<T>> int calcNum(T[] array, T maxElem) {
		int count = 0;
		for (T elem : array) {
			if (elem.compareTo(maxElem) > 0) {
				count++;
			}
		}
		return count;
	}

	public static <T extends Number> Double calcSum(T[] array, T maxValue) {
		Double sum = 0.0;
		for (T item : array) {
			if (item.doubleValue() > maxValue.doubleValue())
				sum += item.doubleValue();
		}
		return sum;
	}
}
