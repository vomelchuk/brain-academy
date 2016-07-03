package com.labs.lab5;

import java.util.Random;

public class InitTest {
	// instance fields
	private int id;
	// class fields
	private static int nextId;

	static {
		Random random = new Random();
		int START = 0, END = 1000;
		nextId = random.nextInt(END - START + 1) + START;
	}

	// constructors
	public InitTest() {
		this.id = nextId;
		nextId++;
	}

	// accessors
	public int getId() {
		return id;
	}

}
