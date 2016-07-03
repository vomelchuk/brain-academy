package labs;

import labs.computers.Computer;

public class ComputerMain {

	public static void main(String[] argv) {

		// task from lab 2.1.3
		printTitle("TASK 2.1.3",
				"Creating array of 5 computers and printing results:");

		Computer[] computers = new Computer[5];

		String[] manufacturers = new String[] { "Apple", "Lenovo", "Asus",
				"Acer", "HP" };
		int[] serialNumbers = new int[] { 45678345, 1258553, 23546565,
				1234366576, 87643423 };
		float[] prices = new float[] { 3000f, 560f, 750f, 600f, 953f };
		int[] quantityCPUs = new int[] { 4, 2, 4, 2, 2 };
		int[] frequencyCPUs = new int[] { 2600, 1600, 2160, 3000, 2800 };

		for (int i = 0; i < computers.length; i++) {
			computers[i] = createComputer(manufacturers[i], serialNumbers[i],
					prices[i], quantityCPUs[i], frequencyCPUs[i]);
			System.out.println("Computer " + (i + 1) + ":");
			printComputerInfo(computers[i]);
		}

		// task from lab 2.1.4
		printTitle("TASK 2.1.4",
				"Iterating through array of computers and increasing price by 10%:");

		for (int i = 0; i < computers.length; i++) {
			computers[i].setPrice(computers[i].getPrice() * 1.1f);
			System.out.println("Computer " + (i + 1) + ":");
			printComputerInfo(computers[i]);
		}

		// task from lab 2.1.5
		printTitle("TASK 2.1.5",
				"Adding to class Computer method view() and using it to demonstarate:");
		for (int i = 0; i < computers.length; i++) {
			System.out.println("Computer " + (i + 1) + ":");
			computers[i].view();
		}
	}

	private static Computer createComputer(String manufacturer,
			int serialNumber, float price, int quantityCPU, int frequencyCPU) {

		Computer temp = new Computer();
		temp.setManufacturer(manufacturer);
		temp.setSerialNumber(serialNumber);
		temp.setPrice(price);
		temp.setQuantityCPU(quantityCPU);
		temp.setFrequencyCPU(frequencyCPU);
		return temp;
	}

	private static void printComputerInfo(Computer item) {
		System.out
				.printf("Manufacturer: %s\nS/N: %s\nPrice: $%.2f\nQuantuty of CPU: %d\nFrequency of CPU: %d MHz\n\n",
						item.getManufacturer(), item.getSerialNumber(),
						item.getPrice(), item.getQuantityCPU(),
						item.getFrequencyCPU());
	}

	private static void printTitle(String header, String description) {
		System.out.println(header);
		System.out.println(description);
		for (int i = 0; i < description.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
