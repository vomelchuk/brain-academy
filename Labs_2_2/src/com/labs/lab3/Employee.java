package com.labs.lab3;

public class Employee {

	public void calcSallary(String name, double... varargs) {

		double totalSalary = 0;
		for (double item : varargs) {
			totalSalary += item;
		}
		String info = String.format("Employee `%s` has salary $%.2f", name,
				totalSalary);
		System.out.println(info);

	}
}
