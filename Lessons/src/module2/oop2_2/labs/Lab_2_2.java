package module2.oop2_2.labs;

import module2.oop2_2.labs.lab1.Matrix;
import module2.oop2_2.labs.lab2.MatrixClone;

public class Lab_2_2 {

	public static void demo() {
		lab_2_2_1();
		// lab_2_2_2();

	}

	public static void lab_2_2_1() {

		Matrix matrix1 = new Matrix();
		matrix1.fillMatrix();
		System.out.println("Matrix 1:");
		matrix1.print();

		Matrix matrix2 = new Matrix();
		matrix2.fillMatrix();
		System.out.println("Matrix 2:");
		matrix2.print();

		System.out.println("Addition:");
		matrix1.addition(matrix2);
		matrix1.print();

		System.out.println("Multiplication:");
		matrix1.multiplication(matrix2);
		matrix1.print();
	}

	public static void lab_2_2_2() {
		MatrixClone matrix1 = new MatrixClone();
		matrix1.fillMatrix();
		System.out.println("MatrixCLone 1:");
		matrix1.print();

		MatrixClone matrix2 = new MatrixClone();
		matrix2.fillMatrix();
		System.out.println("MatrixCLone 2:");
		matrix2.print();

		System.out.println("Addition:");
		matrix1.addition(matrix2);
		matrix1.print();

		System.out.println("Multiplication:");
		matrix1.multiplication(matrix2);
		matrix1.print();
	}
}
