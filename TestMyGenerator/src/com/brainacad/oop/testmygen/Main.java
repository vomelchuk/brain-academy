package com.brainacad.oop.testmygen;

public class Main {

	public static void main(String[] args) {
		MyNumGenerator myGenerator = new MyNumGenerator(5, 10);
		System.out.println("Lab 2.15.4:\nfunction generate()");
		System.out.println(myGenerator.generate());
		System.out.println("\nLab 2.15.5\nfunction generateDistinct()");
		System.out.println(myGenerator.generateDistinct());
	}

}
