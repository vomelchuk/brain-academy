package com.brainacad.oop.teststokennizer;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		String myStr = "This is String, split by StringTokenizer. Created by Student: Vitaliy Omelchuk";
		System.out.println("my string: " + myStr + "\n");

		System.out.println("Tokenizer by `space`:");
		StringTokenizer word = new StringTokenizer(myStr);
		while (word.hasMoreTokens()) {
			System.out.println(word.nextToken());
		}

		System.out.println("\nTokenizer by `sentence`:");
		StringTokenizer sentence = new StringTokenizer(myStr, ".");
		while (sentence.hasMoreTokens()) {
			System.out.println(sentence.nextToken());
		}

	}

}
