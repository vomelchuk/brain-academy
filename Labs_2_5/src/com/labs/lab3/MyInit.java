package com.labs.lab3;

import java.util.Random;

public class MyInit {
	// class fields
	private static  int[] arr;
	// non-static initialization block
	{
		arr = new int[10];
		Random random = new Random();
		int START = 0, END = 100;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(END - START + 1) + START;
		}
	}

	// methods
	public void printArray() {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] + (i < arr.length - 1 ? ", " : "");
		}
		result += "]";
		System.out.println(result);
	}
}
