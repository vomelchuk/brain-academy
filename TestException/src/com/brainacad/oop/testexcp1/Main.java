package com.brainacad.oop.testexcp1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Labs 2.11.1.:\n");
		lab_2_11_1();
		System.out.println("\n\nLabs 2.11.2.:\n");
		lab_2_11_2();

	}

	private static void lab_2_11_1() {
		try {
			throw new Exception("Exception inside try block!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("I`m still here :)");
		}

	}

	private static void lab_2_11_2() {
		try {
			throw new MyException("This message was thrown from Main class!");
		} catch (MyException e) {
			e.printMyMessage();
		}

		MyTest myTest = new MyTest();
		try {
			myTest.test();
		} catch (MyException e) {
			e.printMyMessage();
		}
		myTest = null;
		try {
			myTest.test();
		} catch (MyException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("This reference has value NULL!");
		}
	}
}
