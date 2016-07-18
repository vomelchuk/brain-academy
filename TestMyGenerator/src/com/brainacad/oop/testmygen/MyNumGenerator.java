package com.brainacad.oop.testmygen;

import java.util.*;

public class MyNumGenerator {
	// fields
	private int numOfElm;
	private int maxNumb;

	// constructors
	public MyNumGenerator(int numOfElm, int maxNumb) {
		this.numOfElm = numOfElm;
		this.maxNumb = maxNumb;
	}

	// methods
	public List<Integer> generate() {
		List<Integer> list = new LinkedList<>();
		Random rand = new Random();
		for (int i = 0; i < numOfElm; i++) {
			list.add(rand.nextInt(maxNumb));
		}
		return list;
	}

	public Set<Integer> generateDistinct() {
		Set<Integer> set = new HashSet<>();
		Random rand = new Random();
		int index = 0;
		while (index < numOfElm) {
			if (set.add(rand.nextInt(maxNumb)))
				index++;
		}
		return set;
	}
}
