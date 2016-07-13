package com.brainacad.oop.testenum1;

import java.util.Arrays;
import java.util.Scanner;

//Enum
public class Main {

	public static void main(String[] args) {
		System.out.println("Lab 2.13.1:\n");
		lab_2_13_1();
		System.out.println("\n\nLab 2.13.2:\n");
		lab_2_13_2();
		System.out.println("\n\nLab 2.13.3:\n");
		lab_2_13_3();

	}

	private static void lab_2_13_1() {
		for (MyDayOfWeek day : MyDayOfWeek.values()) {
			System.out.println(day);
		}
	}

	private static void lab_2_13_2() {
		for (MyDayOfWeek day : MyDayOfWeek.values()) {
			switch (day) {
			case TUESDAY:
				System.out.println("My JAVA day: " + day.name());
				break;
			case THURSDAY:
				System.out.println("My JAVA day: " + day.name());
				break;
			case SATURDAY:
				System.out.println("My JAVA day: " + day.name());
				break;
			}
		}

	}

	private static void lab_2_13_3() {
		System.out.print("Input day of the weeek: ");
		try (Scanner scan = new Scanner(System.in)) {
			MyDayOfWeek day = MyDayOfWeek.valueOf(scan.next().toUpperCase());
			System.out.println("The next day of week: " + day.nextDay());
		} catch (IllegalArgumentException e) {
			System.out
					.println("Wrong predefined constant in enum `MyDayOfWeek!`");
			System.out.println("Aloowed values are: "
					+ Arrays.toString(MyDayOfWeek.values()));
		}

	}

}
