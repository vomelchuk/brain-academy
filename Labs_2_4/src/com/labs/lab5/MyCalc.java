package com.labs.lab5;

public class MyCalc {

	public static double calcPi(int number) {

		double pi = 0;
		int step = 1;
		for (int i = 0; i < number; i++) {
			if (i % 2 == 0) {
				pi += 4.0 / step;
			} else {
				pi -= 4.0 / step;
			}
			step += 2;
		}
		return pi;
	}
}
