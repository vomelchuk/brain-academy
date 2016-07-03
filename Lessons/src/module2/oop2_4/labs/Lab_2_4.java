package module2.oop2_4.labs;

import java.util.Arrays;
import java.util.Scanner;

import module2.oop2_4.labs.lab1.MyMath;
import module2.oop2_4.labs.lab2.Calculation;
import module2.oop2_4.labs.lab4.Employee;

public class Lab_2_4 {

	public static void demo() {
		// lab2_4_1();
		//lab2_4_2();
		// lab2_4_3();
		lab2_4_4();
	}

	private static void lab2_4_4() {
		Employee[] employees = new Employee[3];
		
		String[] firstNames = {"Vitaliy","Oleksiy","Stepan"};
		String[] lastNames = {"Omelchuk","Kashpurenko","Dutka"};
		String[] occupations = {"freelancer","manager","ingeneour"};
		int[] telephones = {678743762, 678956784, 506789056};
		
		for(int i=0; i < employees.length; i++){
			//employees[i] = new Employee(getFirstName(),get)
		}
		
	}

	private static void lab2_4_3() {
		
		System.out.print("Input radius: ");
		float radius = new Scanner(System.in).nextFloat();
		System.out.println("The area of the circle with RADIUS " + radius +" equal "+ MyMath.areaOfCircle(radius));
		
	}

	private static void lab2_4_2() {

		int[] array1 = { 1, 4, -6, 89, 0 };
		int[] array2 = { 23, 56, 9, -34, 90 };
		
		Calculation calc1 = new Calculation(array1);
		Calculation calc2 = new Calculation(array2);
		System.out.println("calc1 array = "+Arrays.toString(calc1.getArray()));
		System.out.println("calc1 min = "+calc1.getMin());
		System.out.println("calc1 max = "+calc1.getMax());
		
		System.out.println("calc2 array = "+Arrays.toString(calc2.getArray()));
		System.out.println("calc2 min = "+calc2.getMin());
		System.out.println("calc2 max = "+calc2.getMax());


	}

	private static void lab2_4_1() {

		int[] array = { 1, 3, 6, 0, -4, 67 };
		System.out.println("array = " + Arrays.toString(array));
		System.out.println("MIN = " + MyMath.findMax(array));
		System.out.println("MIN = " + MyMath.findMin(array));

	}

}
