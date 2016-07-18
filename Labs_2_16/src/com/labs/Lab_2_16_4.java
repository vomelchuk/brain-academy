package com.labs;

import com.labs.lab1.*;

public class Lab_2_16_4 {

	public static void demo() {
		Animal a = new Dog();
		foo(null);
	}

	private static void foo(Animal a) {
		System.out.println("Animal");
	}

	private static void foo(Dog a) {
		System.out.println("Dog");
	}

	private static void foo(Puppy a) {
		System.out.println("Puppy");
	}
}
