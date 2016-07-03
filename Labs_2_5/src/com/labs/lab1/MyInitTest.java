package com.labs.lab1;

public class MyInitTest {

	{
		System.out.println("non-static initialization block 1");
	}
	{
		System.out.println("non-static initialization block 2");
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
