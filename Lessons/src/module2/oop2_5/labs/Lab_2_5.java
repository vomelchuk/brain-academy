package module2.oop2_5.labs;

import module2.oop2_5.labs.lab1.MyInitTest;
import module2.oop2_5.labs.lab2.MyInit;
import module2.oop2_5.labs.lab5.InitTest;

public class Lab_2_5 {

	public static void demo() {
		// lab_2_5_1();
		 lab_2_5_2();
		//lab_2_5_5();
	}

	private static void lab_2_5_5() {

		InitTest[] tests = new InitTest[5];

		for (int i = 0; i < tests.length; i++) {
			tests[i] = new InitTest();
			System.out.println("id of test " + (i + 1) + " = " + tests[i].getId());
		}

	}

	private static void lab_2_5_2() {
		MyInit test = new MyInit();
		System.out.print("test = ");
		test.printArray();

		MyInit test2 = new MyInit();
		System.out.print("test2 = ");
		test2.printArray();

	}

	private static void lab_2_5_1() {
		MyInitTest test = new MyInitTest();

	}

}
