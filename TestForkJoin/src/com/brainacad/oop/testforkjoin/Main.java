package com.brainacad.oop.testforkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {

	private static final int SIZE = 1_000_000;
	private static final int START = 0, END = 100;

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] array = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			array[i] = rnd.nextInt(END - START + 1) + START;
		}

		ForkJoinPool pool = new ForkJoinPool();
		long sum = pool.invoke(new MyRecursiveTask(array, 0, array.length));
		System.out.println("Fork/join sum: " + sum);

		Long s = 0L;
		for (int i = 0; i < array.length; i++) {
			s += array[i];
		}
		System.out.println("Classic sum: " + s);

	}

}
