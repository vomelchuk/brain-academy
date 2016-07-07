package com.brainacad.oop.testsregexp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String[] array = { "VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345",
				"ToAd", "TomCat", "" };
		System.out.println("Input array string: " + Arrays.toString(array)
				+ "\n\nafter through regexp:");
		for (String item : array) {
			// System.out.println(item);
			if (checkPersonWithRegExp(item)) {

				System.out.println(item);
			}
		}

	}

	public static boolean checkPersonWithRegExp(String userNameString) {
		String compile = "[A-Z]?[a-z]*";
		Pattern pattern = Pattern.compile(compile);
		Matcher matcher = pattern.matcher(userNameString);
		return matcher.matches();
	}

}
