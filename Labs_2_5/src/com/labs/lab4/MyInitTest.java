package com.labs.lab4;

public class MyInitTest {

	static {
		System.out
				.println("(changed to static) non-static initialization block 1");
	}
	static {
		System.out
				.println("(changed to static) non-static initialization block 2");
	}
	static {
		System.out.println("static initialization block 1");
	}
	static {
		System.out.println("static initialization block 2");
	}

	public MyInitTest() {
		this(0);
		System.out.println("constructor 2");
	}

	public MyInitTest(int... vardata) {
		System.out.println("constructor 1");
	}
}
