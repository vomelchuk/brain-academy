package com.brainacad.oop.testgenerics3;

import java.util.Arrays;
import java.util.Random;

public class MyMixer<T> {
	// fields
	private T[] data;

	// constructors
	public MyMixer(T[] data) {
		this.data = data;
	}

	// methods
	public void shuffle() {
		T[] dataOrigin = data.clone();
		Random rand = new Random();
		int count = 0;
		do {
			int index1 = rand.nextInt(data.length);
			int index2 = rand.nextInt(data.length);
			if (index1 != index2) {
				change(data, index1, index2);
				count++;
			}
		} while (count < data.length / 2 || Arrays.equals(data, dataOrigin));
	}

	@Override
	public String toString() {
		return "MyMixer " + Arrays.toString(data);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(data);
		return result;
	}

	private void change(T[] data2, int i1, int i2) {
		T temp = data[i1];
		data[i1] = data[i2];
		data[i2] = temp;
	}

}
