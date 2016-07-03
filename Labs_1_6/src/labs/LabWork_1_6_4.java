package labs;

import java.util.Arrays;

public class LabWork_1_6_4 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 78, -4, 56, 6, 89, 23, 80 };

		System.out.println(Arrays.toString(array));
		int searchValue = 20;
		Arrays.sort(array);
		int index = Arrays.binarySearch(array, searchValue);

		if (index < 0) {
			System.out.println("The number `" + searchValue + "` not found! ");
		} else {
			System.out
					.println("The index of `" + searchValue + "` is " + index);
		}

	}

}
