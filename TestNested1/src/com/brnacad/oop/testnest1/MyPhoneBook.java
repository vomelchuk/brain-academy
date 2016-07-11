package com.brnacad.oop.testnest1;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
	// fields
	private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

	// nested static class
	private static class PhoneNumber {
		// fields
		private String name;
		private String phone;

		// constructors
		public PhoneNumber(String name, String phone) {
			this.name = name;
			this.phone = phone;
		}

		// getters
		public String getName() {
			return name;
		}

		public String getPhone() {
			return phone;
		}

		// methods
		@Override
		public String toString() {
			return String.format("Name: %s, Phone: %s", name, phone);
		}

	}

	// methods
	public void addPhoneNumber(String name, String phone) {
		int i = 0;
		while (i < phoneNumbers.length) {
			if (phoneNumbers[i] == null) {
				phoneNumbers[i] = new PhoneNumber(name, phone);
				break;
			}
			i++;
		}
	}

	public void printPhoneBook() {
		for (PhoneNumber phoneNumber : phoneNumbers) {
			if (phoneNumber != null) {
				System.out.println(phoneNumber);
			}
		}
	}

	public void sortByName() {
		Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
			@Override
			public int compare(PhoneNumber o1, PhoneNumber o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public void sortByPhoneNumber() {
		Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
			@Override
			public int compare(PhoneNumber o1, PhoneNumber o2) {
				return o1.getPhone().compareTo(o2.getPhone());
			}
		});
	}
}
