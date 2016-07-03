package labs;

public class LabWork_1_5_1 {
	
	public static void main(String[] args) {
		int min = 1, max = 8;

		for (int i = min; i <= max; i++) {
			for (int j = i; j >= min; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
