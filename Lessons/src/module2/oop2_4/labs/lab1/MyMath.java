package module2.oop2_4.labs.lab1;

public class MyMath {

	final static float PI = 3.14f;

	public static float areaOfCircle(float radius) {
		return PI * radius * radius;
	}

	public static int findMin(int arr[]) {

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
