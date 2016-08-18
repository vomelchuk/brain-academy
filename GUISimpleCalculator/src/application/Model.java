package application;

public class Model {

	//private static Calculator calculator;

	@FunctionalInterface
	public interface Operation {
		Integer execute(Integer value1, Integer value2);
	}

	public static class Calculator {
		Operation add = (a, b) -> a + b;
		Operation subtraction = (a, b) -> a - b;
		Operation multiply = (a, b) -> a * b;
		Operation division = (a, b) -> a / b;
	}

}
