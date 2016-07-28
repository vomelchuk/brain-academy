package oop_2_18.common.presentation.paragraphs;

import java.util.Random;

public class RandomNumbers {

	/*
	 * Paragraph: Random Numbers. 
	 * Slides: 23-27
	 */
	public static void demo() {
		//randomNumbers25();
		randomNumbers26();
	}

	/* Slide # 25: Random Class functions, which returns different primitive 
	 *             numeric types values
	 */
	private static void randomNumbers25() {
		Random random = new Random();
		int myInt = random.nextInt();
		System.out.println(myInt);
		double myDouble = random.nextDouble();
		System.out.println(myDouble);
		float myFloat = random.nextFloat();
		System.out.println(myFloat);
	}
	
	/* Slide # 26: Random Class instance initialized with constructor and its
	 *             parameter
	 */
	private static void randomNumbers26() {
		Random rnd1 = new Random(123);
		Random rnd2 = new Random(123);
		Random rnd3 = new Random(124);
		for (int i = 0; i < 10; i++) {
		System.out.println("rnd1 = " + rnd1.nextInt(100)
		               + ", rnd2 = " + rnd2.nextInt(100)
		               + ", rnd3 = " + rnd3.nextInt(100));
		}
	}
}
