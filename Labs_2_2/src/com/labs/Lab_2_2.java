package com.labs;

import com.labs.lab1.Matrix;
import com.labs.lab2.MatrixClone;
import com.labs.lab3.Employee;
import com.labs.lab4.Person;
import com.labs.lab5.A;

public class Lab_2_2 {

	public static void demo() {
		// lab_2_2_1_and_2_2_2();
		// lab_2_2_extra();
		// lab_2_2_3();
		// lab_2_2_4();
		lab_2_2_5();

	}

	public static void lab_2_2_1_and_2_2_2() {

		Matrix matrix1 = new Matrix();
		Matrix matrix2 = new Matrix();
		matrix1.fillMatrix();
		matrix2.fillMatrix();

		System.out.println("Matrix 1:");
		matrix1.print();
		System.out.println("Matrix 2:");
		matrix2.print();

		Matrix matrix3;

		System.out.println("\nResults:\n");

		System.out.println("Addition:");
		matrix3 = matrix1.addition(matrix2);
		matrix3.print();

		System.out.println("Multiplication:");
		matrix3 = matrix1.multiplication(matrix2);
		matrix3.print();
	}

	public static void lab_2_2_3() {

		Employee employee = new Employee();
		employee.calcSallary("Petro", 120, 250, 100);

	}

	public static void lab_2_2_4() {

		Person person1 = new Person();
		person1.setData("Ivan");
		person1.display();

		Person person2 = new Person();
		person2.setData("Stepan", "Dutka");
		person2.display();

		Person person3 = new Person();
		person3.setData("Oleksiy", "Kashpurenko", 38);
		person3.display();

		Person person4 = new Person();
		person4.setData("Halyna", "Kimak", 25, "female");
		person4.display();

		Person person5 = new Person();
		person5.setData("Petro", "Matvijiv", 34, "male", 67854355);
		person5.display();
	}

	public static void lab_2_2_5() {

		A test = new A();
		test.calcSquare(12, 14);
		test.calcSquare(16.0);
		test.calcSquare(4);
		test.calcSquareFinal(10);
	}

	public static void lab_2_2_extra() {

		MatrixClone matrix1 = new MatrixClone();
		MatrixClone matrix2 = new MatrixClone();
		matrix1.fillMatrix();
		matrix2.fillMatrix();

		System.out.println("Matrix 1:");
		matrix1.print();
		System.out.println("Matrix 2:");
		matrix2.print();

		MatrixClone matrix3;

		System.out.println("\nResults:\n");

		System.out.println("Addition:");
		matrix3 = matrix1.addition(matrix2);
		matrix3.print();

		System.out.println("Multiplication:");
		matrix3 = matrix1.multiplication(matrix2);
		matrix3.print();
	}

}
