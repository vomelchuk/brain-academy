package com.brainacad.oop.testthread1;

public class Main {

	public static void main(String[] args) {
		lab_2_17_1();
//		lab_2_17_2();

	}



	private static void lab_2_17_1() {
		MyTimeBomb bomb1 = new MyTimeBomb();
		bomb1.start();
		System.out.println("main method ended");
		
	}
	private static void lab_2_17_2() {
		MyTimeBomb2 bomb1 = new MyTimeBomb2();
		Thread t = new Thread(bomb1);
		t.start();
		System.out.println("main method ended");
		
	}
}
