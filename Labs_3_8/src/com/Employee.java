package com;

public class Employee {
	// fields
	private final String name;
	private int age;
	private final Gender gender;

	// constructors
	public Employee(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// accessors
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setAge(int age) {
		this.age = age;
	}
	// methods

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
