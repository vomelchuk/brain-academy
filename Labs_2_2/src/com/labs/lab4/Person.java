package com.labs.lab4;

public class Person {
	// fields
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private int phoneNumber;

	// setters
	public void setData(String firstName) {
		this.firstName = firstName;
	}

	public void setData(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setData(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void setData(String firstName, String lastName, int age,
			String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}

	public void setData(String firstName, String lastName, int age,
			String gender, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	// methods
	public void display() {
		String info = String
				.format("First name: %s%nLast name: %s%nAge: %d%nGender: %s%nPhone: %d",
						firstName, lastName, age, gender, phoneNumber);
		System.out.println(info + "\n");
	}
}
