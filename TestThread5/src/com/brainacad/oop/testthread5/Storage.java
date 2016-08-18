package com.brainacad.oop.testthread5;

public class Storage {
	// fields
	private int storage;
	private boolean isSetted = false;

	// constructors
	public Storage() {
		storage = 0;
	}

	// accessors
	public synchronized void setStorage(int value) {
		while (isSetted) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		storage = value;
		isSetted = true;
		notify();
	}

	public synchronized int getStorage() {
		while (!isSetted) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		isSetted = false;
		notify();
		return storage;
	}
	/*
	 * 
	 * // public void setStorage(int value) { storage = value; }
	 * 
	 * public int getStorage() { return storage; }
	 */
}
