package com.labs.lab2;

import java.util.Random;

import com.labs.lab1.MyMath;



public class Calculation {
	// instance fields
	private int[] array;

	// constructors
	public Calculation(int[] array) {
		this.array = array;
	}

	// accessors
	public int[] getArray() {
		return array;
	}

	public int getMin() {
		return MyMath.findMin(array);

	}

	public int getMax() {
		return MyMath.findMax(array);
	}

}
