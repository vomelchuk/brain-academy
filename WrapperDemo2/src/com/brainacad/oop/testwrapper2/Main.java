package com.brainacad.oop.testwrapper2;

public class Main {

	public static void main(String[] args) {

		Integer ival = 1000;
		Byte bval = 100;
		System.out.println("Sum Integer(" + ival + ") + Byte(" + bval + ") = "
				+ compute(ival, bval));

		assert ival + bval == compute(ival, bval) : ival + "+" + bval
				+ " must be equal " + (ival + bval);

	}

	private static Long compute(Integer a, Byte b) {
		return a.longValue() + b.longValue();
		// return 0L;

	}

}
