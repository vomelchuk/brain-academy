package labs;

import java.util.Scanner;

public class LabWork_1_5_5 {
	public static void main(String[] args) {

		System.out.print("Input upper bound: ");
		int max = new Scanner(System.in).nextInt();
		int min = 1, sum = 0;

		for (int i = min; i <= max; i++) {
			sum += i;
		}

		double avg = (double) sum / (max - min + 1);

		System.out.println("Sum of numbers from " + min + " to " + max + " : "
				+ sum);
		System.out.println("Average of numbers from " + min + " to " + max
				+ " : " + avg);

	}

}
