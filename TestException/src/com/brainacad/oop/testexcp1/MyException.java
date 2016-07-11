package com.brainacad.oop.testexcp1;

public class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}

	public void printMyMessage() {
		System.out.println(this.getClass() + ": " + super.getMessage());
	}

}
