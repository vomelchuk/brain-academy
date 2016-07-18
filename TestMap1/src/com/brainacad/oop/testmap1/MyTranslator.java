package com.brainacad.oop.testmap1;

import java.util.*;

public class MyTranslator {
	// fields
	private HashMap<String, String> dictionary = new HashMap<String, String>();

	// methods
	public void addNewWord(String en, String ua) {
		dictionary.put(en, ua);
	}

	public String translate(String en) {
		StringTokenizer parse = new StringTokenizer(en);
		StringBuilder result = new StringBuilder();
		while (parse.hasMoreTokens()) {
			String word = parse.nextToken();
			result.append(dictionary.containsKey(word) ? dictionary.get(word)
					: "-" + word + "-");
			result.append(" ");
		}
		return result.toString();
	}
}
