package com.labs.lab6;

public class GravityCalculator {

	final static double ACCELERATION = 9.81;

	public static double calcDist(double t) {
		return 0.5 * ACCELERATION * t * t;
	}

}
