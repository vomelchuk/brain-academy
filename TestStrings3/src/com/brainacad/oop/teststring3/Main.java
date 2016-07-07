package com.brainacad.oop.teststring3;

import java.util.Arrays;

public class Main {

	public static char[] uniqueChars(String s) {

		char[] chars = new char[s.length()];
		int index = 0;

		for (int i = 0; i < s.length(); i++) {
			boolean noUnique = false;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					noUnique = true;
					break;
				}
			}
			if (!noUnique) {
				chars[index++] = s.charAt(i);
			}
		}

		return chars;
	}

	public static void main(String[] args) {

		String str = "Using methods of class String";
		System.out.println("Data string = " + str);
		System.out.println("Unique letters are  = "
				+ Arrays.toString(uniqueChars(str)));
	}
}
