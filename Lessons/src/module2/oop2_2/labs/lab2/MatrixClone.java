package module2.oop2_2.labs.lab2;

import module2.oop2_2.labs.lab1.Matrix;

public class MatrixClone {

	private Matrix matrix = new Matrix();

	public void fillMatrix() {
		matrix.fillMatrix();
	}

	public void addition(MatrixClone matrix) {
		this.matrix.addition(matrix.matrix);
	}

	public void multiplication(MatrixClone matrix) {
		this.matrix.multiplication(matrix.matrix);
	}

	public void print() {
		matrix.print();
	}

}
