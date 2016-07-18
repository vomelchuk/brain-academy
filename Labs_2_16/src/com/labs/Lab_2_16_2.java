package com.labs;

class Lab_2_16_2 {

	public static void demo() {
		byte b = 67;
		foo(b);
	}

	private static void foo(int i) {
		System.out.println("int");
	}

	private static void foo(Byte i) {
		System.out.println("Byte");
	}
}
