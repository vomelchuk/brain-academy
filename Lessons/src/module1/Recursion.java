package module1;

public class Recursion {

	public static void main(String[] args) {
		System.out.println("Sum all odd numbers from 1 to 5 = "
				+ sumOfOddNumbersInRange(5, 9));

	}

	static int sumOfOddNumbersInRange(int start, int end) {
		return sumOfOddNumbers(start % 2 > 0 ? start : start + 1,
				end % 2 > 0 ? end : end - 1, start % 2 > 0 ? start : start + 1);
	}

	static int sumOfOddNumbers(int start, int end, int sum) {
		return start != end ? sumOfOddNumbers(start += 2, end, sum += start)
				: sum;
	}

}
