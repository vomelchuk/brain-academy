package com.labs;

import com.labs.lab1.Animal;

public class Lab_2_16_5 {

	public static void demo() {
		byte b = 5;
		foo(b);
		foo(5);

	}

	private static void foo(int i) {
		System.out.println("int");
	}

	private static void foo(byte b) {
		System.out.println("byte");
	}
}
