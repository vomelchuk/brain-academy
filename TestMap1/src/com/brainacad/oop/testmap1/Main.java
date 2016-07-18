package com.brainacad.oop.testmap1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyTranslator translator = new MyTranslator();
		String[] en = { "cat", "caught", "mouse", "Kyiv", "is", "a", "capital",
				"of", "Ukraine" };
		String[] ua = { "кіт", "зловив", "мишку", "Київ", "є", "", "столиця",
				"", "України" };

		for (int i = 0; i < en.length; i++) {
			translator.addNewWord(en[i], ua[i]);
		}
		System.out.println("Input string in english:");
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println(translator.translate(scan.nextLine()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
