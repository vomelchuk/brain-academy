package labs;

public class LabWork_1_5_3 {

	public static void main(String[] args) {

		int min = 1, max = 9;

		System.out.println("* |  1  2  3  4  5  6  7  8  9");
		System.out.println("-----------------------------");

		for (int i = min; i <= max; i++) {
			System.out.print(i + " |");
			for (int j = min; j <= max; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}

	}

}
