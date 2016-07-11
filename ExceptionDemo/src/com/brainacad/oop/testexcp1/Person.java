package com.brainacad.oop.testexcp1;

public class Person {
	// fields
	private String firstName;
	private String lasttName;
	private int age;

	// accessors
	public String getFirstName() {
		return firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public void setAge(int age) {
		try {
			if (age < 1 || age > 120) {
				throw new InvalidAgeException(
						"Age must be betweeen 1 and 120! Age was`nt changed!");
			}
			this.age = age;
		} catch (InvalidAgeException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	// methods
	@Override
	public String toString() {
		return String.format("Person[First name: %s, Last name: %s, Age: %d]",
				firstName, lasttName, age);
	}

}
