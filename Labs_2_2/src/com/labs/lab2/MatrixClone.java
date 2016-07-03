package com.labs.lab2;

import com.labs.lab1.Matrix;


public class MatrixClone {

	private Matrix matrix = new Matrix();

	public void fillMatrix() {
		matrix.fillMatrix();
	}

	public MatrixClone addition(MatrixClone matrix) {
		MatrixClone temp = new MatrixClone();
		temp.matrix = this.matrix.addition(matrix.matrix);
		return temp;
	}

	public MatrixClone multiplication(MatrixClone matrix) {
		MatrixClone temp = new MatrixClone();
		temp.matrix = this.matrix.multiplication(matrix.matrix);
		return temp;
	}

	public void print() {
		matrix.print();
	}

}
