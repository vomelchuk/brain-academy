package com.brainacad.oop.testthread5;

public class Storage {
	// fields
	private int storage;
	private boolean isReady = true;

	// constructors
	public Storage() {
		storage = 0;
	}

	// accessors
	public synchronized void setStorage(int value) {
		while (!isReady) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		isReady = false;
		storage = value;
		notify();
	}

	public synchronized int getStorage() {
		while (isReady) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		isReady = true;
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
