package com.brainacad.oop.testcollection1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			list.add("number_" + i);
		}
		for (String elem : list) {
			System.out.println(elem);
		}
	}

}
