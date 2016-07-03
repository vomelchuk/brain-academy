package com.labs;

import com.labs.lab1.MyInitTest;
import com.labs.lab2.MyInit;
import com.labs.lab5.InitTest;

public class Lab_2_5 {

	public static void demo() {
		lab_2_5_1();
		// lab_2_5_2();
		// lab_2_5_3();
		// lab_2_5_4();
		// lab_2_5_5();
	}

	private static void lab_2_5_1() {
		MyInitTest test = new MyInitTest();
	}

	private static void lab_2_5_2() {
		MyInit test1 = new MyInit();
		MyInit test2 = new MyInit();

		System.out.print("test1 = ");
		test1.printArray();

		System.out.print("test2 = ");
		test2.printArray();

	}

	private static void lab_2_5_3() {
		com.labs.lab3.MyInit test1 = new com.labs.lab3.MyInit();
		com.labs.lab3.MyInit test2 = new com.labs.lab3.MyInit();

		System.out.print("test1 = ");
		test1.printArray();

		System.out.print("test2 = ");
		test2.printArray();

	}

	private static void lab_2_5_4() {
		com.labs.lab4.MyInitTest test = new com.labs.lab4.MyInitTest();

	}

	private static void lab_2_5_5() {

		InitTest[] tests = new InitTest[5];

		for (int i = 0; i < tests.length; i++) {
			tests[i] = new InitTest();
			System.out.println("id of test " + (i + 1) + " = "
					+ tests[i].getId());
		}

	}

}
