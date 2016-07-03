package labs;

import java.util.Arrays;

public class LabWork_1_6_2 {

	public static void main(String[] args) {

		int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
		int max = m[0], min = m[0];
		float avg, median ;

		if (m.length % 2 != 0) {
			median = m[m.length / 2];
		} else {
			median = (float)(m[m.length / 2 - 1] + m[m.length / 2]) / 2;
		}

		int sum = m[0];
		for (int i = 1; i < m.length; i++) {
			sum += m[i];
			if (min > m[i]) {
				min = m[i];
			}
			if (max < m[i]) {
				max = m[i];
			}
		}

		avg = (float) sum / m.length;

		System.out.println("Array = " + Arrays.toString(m));
		System.out.println("max = " + max + "\nmin = " + min + "\nmedian = "
				+ median + "\navg = " + avg);
	}

}
