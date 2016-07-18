package com.labs;

import com.labs.lab1.*;

 class Lab_2_16_1 {

	public static void demo() {
		Animal a = new Dog();
		foo(a);
	}

	private static void foo(Animal a) {
		System.out.println("Animal");
	}

	private static void foo(Dog a) {
		System.out.println("Dog");
	}

}
