package com.brainacad.oop.teststring1;

public class Main {

	public static void main(String[] args) {

		String myStr = "abracadabra";
		System.out.println("Data string: " + myStr + "\n");

		System.out
				.println("the index of first `ra` is: " + myStr.indexOf("ra"));

		System.out.println("the index of last `ra` is: "
				+ myStr.lastIndexOf("ra"));

		System.out.println("substring of myStr from 3 to 7: "
				+ myStr.substring(3, 7));

		System.out.println("\nreverse `a baba halamaha` is: `"
				+ reverseString("a baba halamaha") + "`");

	}

	public static StringBuilder reverseString(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			result.append(str.charAt(i));
		}
		return result;
	}

}
