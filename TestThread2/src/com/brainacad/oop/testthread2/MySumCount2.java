package com.brainacad.oop.testthread2;

public class MySumCount2 implements Runnable {

	// fields
	private int startIndex;
	private int stopIndex;
	private int[] array;
	private long resultSum;
	Thread th;
	{
		resultSum = 0;
	}

	// constructors
	public MySumCount2(int startIndex, int stopIndex, int[] array) {
		this.startIndex = startIndex;
		this.stopIndex = stopIndex;
		this.array = array;
		th = new Thread(this);
		th.start();
		System.out.println("Thread " + th.getName() + " started");
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread " + th.getName() + " ended");
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
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Sum of array elements by thread called " + th.getName() + ": " + getResultSum());
	}

}
