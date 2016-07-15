package com.brainacad.oop.testgenerics1;

public class Main {

	public static void main(String[] args) {
		MyTuple<String, Integer, Long> tuple1 = new MyTuple<>("some string",
				25, 56L);
		MyTuple<Double, String, String> tuple2 = new MyTuple<>(
				Double.valueOf(45), "one string", "two string");

		System.out.printf("tuple1: a=%s, b=%d, c=%d%n", tuple1.getA(),
				tuple1.getB(), tuple1.getC());
		System.out.printf("tuple2: a=%.2f, b=%s, c=%s%n", tuple2.getA(),
				tuple2.getB(), tuple2.getC());
	}
}
