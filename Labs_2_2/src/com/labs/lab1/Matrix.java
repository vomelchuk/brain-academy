package com.labs.lab1;

import java.util.Random;

public class Matrix {

	private final int[][] matrix = new int[2][2];

	public void fillMatrix() {
		Random r = new Random();
		int min = 1, max = 5;
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[rows].length; cols++) {
				matrix[rows][cols] = r.nextInt(max - min + 1) + min;
			}
		}
	}

	public Matrix addition(Matrix matrix) {
		Matrix temp = new Matrix();
		for (int rows = 0; rows < this.matrix.length; rows++) {
			for (int cols = 0; cols < this.matrix[rows].length; cols++) {
				temp.matrix[rows][cols] = this.matrix[rows][cols]
						+ matrix.matrix[rows][cols];
			}
		}
		return temp;
	}

	public Matrix multiplication(Matrix matrix) {
		Matrix temp = new Matrix();
		for (int rows = 0; rows < this.matrix.length; rows++) {
			for (int cols = 0; cols < this.matrix[rows].length; cols++) {
				temp.matrix[rows][cols] = this.matrix[rows][cols]
						* matrix.matrix[rows][cols];
			}
		}
		return temp;
	}

	public void print() {
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[rows].length; cols++) {
				System.out.printf("%-7d", matrix[rows][cols]);
			}
			System.out.println();
		}
	}
}
