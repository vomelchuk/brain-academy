package com.brainacad.oop.testdeadlock1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main started...");
		MyObject[] objects = new MyObject[] { new MyObject(1), new MyObject(2), new MyObject(3) };
		MyThread t1 = new MyThread("Thread 1", objects[0], objects[1], objects[2]);
		MyThread t2 = new MyThread("Thread 2", objects[1], objects[2], objects[0]);
		MyThread t3 = new MyThread("Thread 3", objects[2], objects[0], objects[1]);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main ended");
	}

}
