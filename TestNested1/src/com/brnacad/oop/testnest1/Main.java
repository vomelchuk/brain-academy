package com.brnacad.oop.testnest1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Labs 2.12.1:\n");
		labs_2_12_1();
		System.out.println("\n\nLabs 2.12.2:\n");
		labs_2_12_2();
		System.out.println("\n\nLabs 2.12.3:\n");
		labs_2_12_3();
	}

	private static void labs_2_12_1() {
		String[] names = { "Petro", "Halyna", "Ivan", "Stepan", "Oleksiy" };
		String[] phones = { "0504567834", "0678906745", "0637834590",
				"0995689999", "0679918895" };
		MyPhoneBook phoneBook = new MyPhoneBook();

		for (int i = 0; i < names.length; i++) {
			phoneBook.addPhoneNumber(names[i], phones[i]);
		}

		phoneBook.printPhoneBook();
	}

	private static void labs_2_12_2() {
		String[] names = { "Petro", "Halyna", "Ivan", "Stepan", "Oleksiy",
				"Andriy", "Mykyta", "Bohdan", "Ira", "Danylo", "HHH" };
		String[] phones = { "0504567834", "0678906745", "0637834590",
				"0995689999", "0679918895", "0995678909", "06734567890",
				"04434567890", "0323491014", "07754673877", "89" };
		MyPhoneBook phoneBook = new MyPhoneBook();

		for (int i = 0; i < names.length; i++) {
			phoneBook.addPhoneNumber(names[i], phones[i]);
		}
		System.out.println("Phonebook before sorting:");
		phoneBook.printPhoneBook();

		System.out.println("\nPhonebook sorting by name:");
		phoneBook.sortByName();
		phoneBook.printPhoneBook();

		System.out.println("\nPhonebook sorting by phone:");
		phoneBook.sortByPhoneNumber();
		phoneBook.printPhoneBook();
	}

	private static void labs_2_12_3() {
		MyPhone myPhone = new MyPhone();
		myPhone.switchOn();
		System.out.print("Give number from phonebook: ");
		try {
			myPhone.call(new Scanner(System.in).nextInt());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
