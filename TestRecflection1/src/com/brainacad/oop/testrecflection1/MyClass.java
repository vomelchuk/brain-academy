package com.brainacad.oop.testrecflection1;

public final class MyClass {

	// fields
	public int a;
	private int b;
	private final int c = 38;
	private static int d;

	// constructors
	public MyClass() {
	}

	public MyClass(int a, int b) {

		this.a = a;
		this.b = b;
	}

	private MyClass(int a) {
		this.a = a;
	}
	// accessors

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public static int getD() {
		return d;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void setD(int d) {
		MyClass.d = d;
	}

	@Override
	public String toString() {
		return "MyClass [a=" + a + ", b=" + b + ", c=" + c + ", static d=" + d + "]";
	}

	// methods

}
