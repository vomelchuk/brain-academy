package labs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LabWork_1_6_5 {
	public static void main(String[] args) {

		final int START = 1, END = 7;
		int[][] array = new int[4][10];
		// filing array
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(END - START + 1) + START;
			}
		}
		// printing array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d", array[i][j]);
			}
			System.out.println();
		}

		System.out.print("\nInput search value: ");
		int searchValue = new Scanner(System.in).nextInt();

		// printing results of searching
		System.out.println("\nResults:");
		for (int i = 0; i < array.length; i++) {
			boolean isFound = false; // search value exists in row
			System.out.print("Line " + i + ": [ ");

			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] == searchValue) {
					if (isFound && array[i][j - 1] != searchValue) {
						System.out.print(",");
					}
					if (j == array[i].length - 1 && array[i][j - 1] == searchValue ||
							(j < array[i].length - 1 && array[i][j + 1] != searchValue &&
								j != 0 && array[i][j - 1] == searchValue)) {
						System.out.print("-");
					}
					isFound = true; // the search value was founded
					if (j == 0 || j == array[i].length - 1) {
						System.out.print(j);
					} else if (array[i][j - 1] != searchValue
							|| array[i][j + 1] != searchValue) {
						System.out.print(j);
					}
				}
			}
			if (!isFound) {
				System.out.print("not found");
			}
			System.out.println(" ]");
		}

	}

}
