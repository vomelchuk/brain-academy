package com.brainacad.oop.testthread2;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		 lab_2_17_3();
		lab_2_17_4();
	}

	private static void lab_2_17_4() {
		System.out.println("Thread " + Thread.currentThread().getName() + " started");
		final int START = 0, END = 1000;
		final int START_INDEX = 34, STOP_INDEX = 134;
		int[] myArray = new int[END];

		Random rand = new Random();
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rand.nextInt(END - START + 1) + START;
		}

		System.out.println("\nArray = " + Arrays.toString(myArray));
		MySumCount2 r1 = new MySumCount2(START_INDEX, STOP_INDEX, myArray);
		MySumCount2 r2 = new MySumCount2(START_INDEX, STOP_INDEX, myArray);
		System.out.println("\nThread " + Thread.currentThread().getName() + " ended");

	}

	private static void lab_2_17_3() {
		System.out.println("Thread " + Thread.currentThread().getName() + " started");
		final int START = 0, END = 1000;
		final int START_INDEX = 34, STOP_INDEX = 134;
		int[] myArray = new int[END];

		MySumCount t1 = new MySumCount(START_INDEX, STOP_INDEX, myArray);
		MySumCount t2 = new MySumCount(START_INDEX, STOP_INDEX, myArray);
		Random rand = new Random();
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rand.nextInt(END - START + 1) + START;
		}
		t1.start();
		System.out.println("Thread " + t1.getName() + " started");
		t2.start();
		System.out.println("Thread " + t2.getName() + " started");

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\nArray = " + Arrays.toString(myArray));
		System.out.println("Sum of array elements by thread called " + t1.getName() + ": " + t1.getResultSum());
		System.out.println("Sum of array elements by thread called " + t2.getName() + ": " + t2.getResultSum());
		System.out.println("\nThread " + Thread.currentThread().getName() + " ended");

	}

}
