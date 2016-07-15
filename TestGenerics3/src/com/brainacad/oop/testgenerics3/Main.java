package com.brainacad.oop.testgenerics3;

public class Main {

	public static void main(String[] args) {

		Integer[] intArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] strArray = new String[] { "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine" };

		MyMixer<Integer> intMixer = new MyMixer<>(intArray);
		MyMixer<String> strMixer = new MyMixer<>(strArray);

		System.out.println(intMixer);
		System.out.println(strMixer);
		System.out.println("\nShuffle... OK");
		intMixer.shuffle();
		System.out.println(intMixer);
		strMixer.shuffle();
		System.out.println(strMixer);
	}

}
