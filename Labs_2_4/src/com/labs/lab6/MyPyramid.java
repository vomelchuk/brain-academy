package com.labs.lab6;

public class MyPyramid {

	public static void printPyramid(int height) {
		for (int i = 0, left = height - 1, right = height - 1; i < height; i++, left--, right++) {
			int symbol = 1;
			for (int j = 0; j < height * 2 - 1; j++) {
				if (j >= left && j < height - 1) {
					System.out.print(symbol++);
				} else if (j >= height - 1 && j <= right) {
					System.out.print(symbol--);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
