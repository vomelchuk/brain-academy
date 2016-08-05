package com.brainacad.oop.testthread5;

public class Counter extends Thread {
	// fields
	private Storage storage;

	// constructors
	public Counter(Storage storage) {
		this.storage = storage;
	}

	// methods
	@Override
	public void run() {
		for (int i = 0; i < 1_0000; i++) {
			storage.setStorage(i);
		}
	}

}
