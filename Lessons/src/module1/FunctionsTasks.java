package module1;

import java.util.Scanner;

public class FunctionsTasks {

	public static void main(String[] args) {
		// drawLine(getShapeSideLength());
		// drawRectangle(getShapeSideLength());
		drawTriangle(getShapeSideLength());
	}

	// Line

	static int getShapeSideLength() {
		System.out.println("Please, enter shape side length: ");
		Scanner sc = new Scanner(System.in);
		int inputShapeLength = sc.hasNextInt() ? sc.nextInt() : 0;
		return inputShapeLength > 0 ? inputShapeLength : 0;
	}

	static void drawLine(int lineLength) {
		if (lineLength == 0) {
			System.out.println("Shape length value is incorrect!");
			return;
		}
		System.out.print("Enter `V` (vertical) or `H` (horizontal): ");
		switch (new Scanner(System.in).nextLine().toUpperCase().charAt(0)) {
		case 'V':
			drawLineByDirection('V', lineLength);
			break;
		case 'H':
			drawLineByDirection('H', lineLength);
			break;
		default:
			System.out
					.println("Incorrect value passed@\nHorizontal is default direction");
			drawLineByDirection('H', lineLength);
		}

	}

	static void drawLineByDirection(char direction, int lineLength) {
		String iteration = null;
		if (direction == 'V') {
			iteration = "\n";
		} else if (direction == 'H') {
			iteration = "";
		}
		for (int i = 0; i < lineLength; i++) {
			System.out.print("*" + iteration);
		}
		System.out.println();
	}

	// Rectangle

	static void drawRectangle(int lineLength) {
		if (lineLength == 0) {
			System.out.println("Shape length value is incorrect!");
			return;
		}
		System.out.print("Enter `E` (empty) or `F` (full): ");
		switch (new Scanner(System.in).nextLine().toUpperCase().charAt(0)) {
		case 'E':
			drawRectangleByFilling('E', lineLength);
			break;
		case 'F':
			drawRectangleByFilling('F', lineLength);
			break;
		default:
			System.out
					.println("Incorrect value passed\nHorizontal is default direction");
			drawLineByDirection('H', lineLength);
		}

	}

	static void drawRectangleByFilling(char direction, int rectLength) {

		if (direction == 'E') {
			for (int rows = 0; rows < rectLength; rows++) {
				for (int cols = 0; cols < rectLength; cols++) {

					if (rows == 0 || rows == rectLength - 1) {
						System.out.print("*");
					} else {
						if (cols == 0 || cols == rectLength - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}

				}
				System.out.println();
			}
		} else if (direction == 'F') {
			for (int rows = 0; rows < rectLength; rows++) {
				for (int cols = 0; cols < rectLength; cols++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		System.out.println();
	}

	// Triangle

	static void drawTriangle(int sideLength) {
		if (sideLength == 0) {
			System.out.println("Shape length value is incorrect!");
			return;
		}
		System.out.print("Enter `E` (empty) or `F` (full): ");
		switch (new Scanner(System.in).nextLine().toUpperCase().charAt(0)) {
		case 'E':
			drawTriangleByDirection('E', sideLength);
			break;
		case 'F':
			drawTriangleByDirection('F', sideLength);
			break;
		default:
			System.out
					.println("Incorrect value passed@\nHorizontal is default direction");
			drawLineByDirection('H', sideLength);
		}

	}

	static void drawTriangleByDirection(char direction, int sideLength) {

		if (direction == 'E') {
			for (int rows = 0; rows < sideLength; rows++) {
				for (int cols = 0; cols <= rows; cols++) {
					if (rows == 0 || rows == sideLength - 1) {
						System.out.print("*");
					} else {
						if (cols == 0 || cols == rows) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		} else if (direction == 'F') {
			for (int rows = 0; rows < sideLength; rows++) {
				for (int cols = 0; cols <= rows; cols++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		System.out.println();
	}
}
