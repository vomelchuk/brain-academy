package labs;

public class LabWork_1_5_4 {

	public static void main(String[] args) {

		int start = 1, end = 300;
		int count = 0;

		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 || i % 4 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 10) {
				break;
			}
		}

	}
}
