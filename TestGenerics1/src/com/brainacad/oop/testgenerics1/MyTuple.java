package com.brainacad.oop.testgenerics1;

public class MyTuple<A, B, C> {
	// fields
	private A a;
	private B b;
	private C c;

	// constructors
	public MyTuple(A a, B b, C c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// getters
	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

	public C getC() {
		return c;
	}

}
