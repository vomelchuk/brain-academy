package com.labs;

import java.util.Arrays;

public class Lab_2_16_3 {

	public static void demo() {
		foo(1, 2);
		foo(1, 2, 3);

	}

	private static void foo(int a, int b) {
		System.out.println("a = " + a + ", b = " + b);
	}

	private static void foo(int... array) {
		System.out.println("array " + Arrays.toString(array));
	}

}
