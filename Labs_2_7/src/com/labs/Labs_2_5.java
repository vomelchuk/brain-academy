package com.labs;

import com.labs.lab1.*;

public class Labs_2_5 {

	public static void demo() {
		System.out.println("Labs 2.7.1 - 2.7.2:\n");
		lab_2_7_1_and_2_7_2();
		System.out.println("\n\nLabs 2.7.3 - 2.7.5:\n");
		lab_2_7_3_and_2_7_4_and_2_7_5();
	}

	private static void lab_2_7_1_and_2_7_2() {
		Monitor monitor = new Monitor("Dell", 250f, "SN12389567", 1920, 1080);
		EthernetAdapter lan = new EthernetAdapter("Intel", 30f, "456894L78",
				1000, "AA:67:45:6F:8D");
		System.out.println(monitor);
		System.out.println(lan);
	}

	private static void lab_2_7_3_and_2_7_4_and_2_7_5() {

		// instaniate Monitor, EthernetAdapter
		Monitor monitor1 = new Monitor("Dell", 250f, "SN12389567", 1920, 1080);
		Monitor monitor2 = new Monitor("Samsung", 196f, "SN1239567", 1368, 768);
		Monitor monitor3 = new Monitor("Samsung", 196f, "SN1239567", 1368, 768);

		EthernetAdapter lan1 = new EthernetAdapter("Intel", 30f, "456894L78",
				1000, "AA:67:45:6F:8D");
		EthernetAdapter lan2 = new EthernetAdapter("D-link", 5f, "GH4568JN",
				1000, "45:AC:45:6F:8D");
		// creating array of devices
		Device[] devices = new Device[] { monitor1, monitor2, monitor3, lan1,
				lan2 };
		// using toString() to show all elements in array
		for (Device device : devices) {
			System.out.println(device);
		}
		// testing override method equal()
		System.out.println("\nUsing equals():");
		System.out.println("monitor1.equals(monitor2): "
				+ devices[0].equals(devices[1]));
		System.out.println("monitor1.equals(monitor3): "
				+ devices[0].equals(devices[2]));
		System.out.println("monitor2.equals(monitor3): "
				+ devices[1].equals(devices[2]));
		System.out.println("lan1.equals(lan2): "
				+ devices[3].equals(devices[4]));
		System.out.println("\nUsing hashCode():");
		// testing override method hashCode()
		for (Device device : devices) {
			System.out.println(device.hashCode());
		}
	}

}
