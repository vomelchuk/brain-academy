package com.brainacad.oop.testcollection2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		Random rand = new Random();
		final int START = 0, END = 10;

		while (list.size() <= END) {
			String value;
			do {
				value = "number_"
						+ Integer
								.valueOf(rand.nextInt(END - START + 1) + START)
								.toString();
			} while (list.contains(value));
			list.push(value);
		}

		for (String elem : list) {
			System.out.println(elem);
		}
	}
}
