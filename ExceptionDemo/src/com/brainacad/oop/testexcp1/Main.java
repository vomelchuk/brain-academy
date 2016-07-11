package com.brainacad.oop.testexcp1;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("Vitaliy");
		person.setLasttName("Omelchuk");
		person.setAge(38);
		System.out.println("Cretated person:\n" + person);
		System.out.println("Trying set age to 145...");
		person.setAge(145);
		System.out.println("After setting wrong age:\n" + person);

	}

}
