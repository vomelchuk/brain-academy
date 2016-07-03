package module2.oop2_1.animalstest;

import java.util.Scanner;

import module2.oop2_1.animalstest.animals.Animal;

public class TrainingMain {

	public static void main(String[] args) {

		// task1();
		// task2();
		task3();

	}

	public static void task3() {

		Animal[] animals = new Animal[3];

		for (int i = 0; i < animals.length; i++) {
			System.out.println("Input data for animal " + (i + 1));
			animals[i] = initAnimal(setConsoleNick(), setConsoleAge(),
					setConsoleKind());
			System.out.println();
		}

		System.out.println("--------\nResults:\n--------");

		for (int i = 0; i < animals.length; i++) {
			animals[i].view();
		}

	}

	public static String setConsoleKind() {
		System.out.print("Kind: ");
		return new Scanner(System.in).nextLine();
	}

	private static int setConsoleAge() {
		System.out.print("Age: ");
		return new Scanner(System.in).nextInt();
	}

	public static String setConsoleNick() {
		System.out.print("Nick: ");
		return new Scanner(System.in).nextLine();
	}

	public static Animal initAnimal(String nick, int age, String kind) {
		Animal temp = new Animal();
		temp.setNick(nick);
		temp.setAge(age);
		temp.setKind(kind);
		return temp;
	}

	public static void task2() {
		Animal[] animals = new Animal[3];

		String[] nicks = { "Vas`ka", "Sharko", "Durko" };
		int[] ages = { 5, 7, 12 };
		String[] kinds = { "cats", "dogs", "parrots" };

		for (int i = 0; i < animals.length; i++) {
			animals[i] = createAnimal(nicks[i], ages[i], kinds[i]);
			animals[i].view();
		}

	}

	public static Animal createAnimal(String nick, int age, String kind) {
		Animal temp = new Animal();
		temp.setNick(nick);
		temp.setAge(age);
		temp.setKind(kind);
		return temp;

	}

	public static void task1() {
		Animal cat = new Animal();
		Animal dog = new Animal();

		cat.setNick("Vas`ka");
		cat.setAge(5);
		cat.setKind("cats");
		cat.view();
	}

}
