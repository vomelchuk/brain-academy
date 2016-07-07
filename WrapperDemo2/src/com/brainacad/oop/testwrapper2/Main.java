package com.brainacad.oop.testwrapper2;

public class Main {

	public static void main(String[] args) {

		Integer ival = 23456;
		Byte bval = 120;

		System.out.println("Sum Integer(" + ival + ") + Byte(" + bval + ") = "
				+ compute(ival, bval));

	}

	private static Long compute(Integer a, Byte b) {
		return a.longValue() + b.longValue();

	}

}
