package labs;

public class LabWork_1_6_3 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i + 1) + 4 * j;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}

	}

}
