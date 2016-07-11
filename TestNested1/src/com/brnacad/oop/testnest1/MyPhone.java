package com.brnacad.oop.testnest1;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
	// fields
	private MyPhoneBook phoneBook;

	// constructors
	public MyPhone() {
	}

	// inner class
	private class MyPhoneBook {
		// fields
		private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

		// nested static class
		private class PhoneNumber {
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

	static class Bluetooth {
	}

	class MemoryCard {
	}

	class SimCard {
	}

	static class TouchScreen {
	}

	static class PowerOnButton {
	}

	static class PhoneBattery {
	}

	static class PhoneDisplay {
	}

	static class PhoneSpeaker {
	}

	// methods of outer class
	public void switchOn() {
		System.out.print("Loading PhoneBook records… ");
		phoneBook = new MyPhoneBook();
		fillPhoneBook(phoneBook);
		System.out.println("OK");
	}

	private void fillPhoneBook(MyPhoneBook phoneBook) {
		String[] names = { "Petro", "Halyna", "Ivan", "Stepan", "Oleksiy",
				"Andriy", "Mykyta", "Bohdan", "Ira", "Danylo" };
		String[] phones = { "0504567834", "0678906745", "0637834590",
				"0995689999", "0679918895", "0995678909", "06734567890",
				"04434567890", "0323491014", "07754673877" };
		for (int i = 0; i < names.length; i++) {
			phoneBook.addPhoneNumber(names[i], phones[i]);
		}
	}

	public void call(int person) throws ArrayIndexOutOfBoundsException {
		if (person < 0 || person > phoneBook.phoneNumbers.length - 1) {
			throw new ArrayIndexOutOfBoundsException(
					"Wrong number in phone book!");
		}
		System.out.print("Calling to: ");
		System.out.printf("Name: %s, phone: %s%n",
				phoneBook.phoneNumbers[person].getName(),
				phoneBook.phoneNumbers[person].getPhone());
	}

}
