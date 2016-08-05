package com.brainacad.oop.testthread5;

public class Printer extends Thread {
	// fields
	private Storage storage;

	// constructors
	public Printer(Storage storage) {
		this.storage = storage;
	}

	// methods
	@Override
	public void run() {
		for (int i = 0; i < 1_0000; i++) {
			System.out.println(storage.getStorage());
		}
	}

}
