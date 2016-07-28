package com.brainacad.oop.testthread2;

public class MySumCount extends Thread {

	// fields
	private int startIndex;
	private int stopIndex;
	private int[] array;
	private long resultSum;
	{
		resultSum = 0;
	}

	// constructors
	public MySumCount(int startIndex, int stopIndex, int[] array) {
		this.startIndex = startIndex;
		this.stopIndex = stopIndex;
		this.array = array;
	}

	// accessors
	public int getStartIndex() {
		return startIndex;
	}

	public int getStopIndex() {
		return stopIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public void setStopIndex(int stopIndex) {
		this.stopIndex = stopIndex;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public long getResultSum() {
		return resultSum;
	}

	// methods
	@Override
	public void run() {
		for (int elem : array) {
			if (elem >= startIndex && elem <= stopIndex)
				resultSum += elem;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread " + getName() + " ended");
	}

}
