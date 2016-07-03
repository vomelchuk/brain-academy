package module2.oop2_5.labs.lab2;

public class MyInit {

	private static int[] arr;

	{
		arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (100 * Math.random());
		}
	}

	public void printArray() {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] + (i < arr.length - 1 ? ", " : "");
		}
		result += "]";
		System.out.println(result);
	}
}
