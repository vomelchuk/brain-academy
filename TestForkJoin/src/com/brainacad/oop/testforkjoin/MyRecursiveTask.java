package com.brainacad.oop.testforkjoin;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Long> {
	private static final long serialVersionUID = 1L;
	private int[] source;
	private int from;
	private int to;
	private static int thresHold = 20;

	public MyRecursiveTask(int[] source, int from, int to) {
		super();
		this.source = source;
		this.from = from;
		this.to = to;
	}

	public Long compute() {
		if (source.length < thresHold) {
			return computeDirectly(from, to);
		}

		int mid = source.length / 2;

		System.out.printf("Forking computation into two subarray: " + "array[%d .. %d] and array[%d .. %d] %n", from,
				from + mid, from + mid + 1, to);

		int[] destLeft = new int[mid];
		System.arraycopy(source, 0, destLeft, 0, mid);
		MyRecursiveTask oneHalf = new MyRecursiveTask(destLeft, from, from + mid);
		oneHalf.fork();

		int[] destRight = new int[source.length - mid];
		System.arraycopy(source, mid, destRight, 0, source.length - mid);
		MyRecursiveTask anotherHalf = new MyRecursiveTask(destRight, from + mid + 1, to);
		long result = anotherHalf.compute();
		return oneHalf.join() + result;

	}

	public Long computeDirectly(int from, int to) {
		Long sum = 0L;
		for (int i = 0; i < source.length; i++) {
			sum += source[i];
		}
		System.out.printf("\tSumming of value array[%d...%d]: %d\n", from, to, sum);
		return sum;
	}

}
