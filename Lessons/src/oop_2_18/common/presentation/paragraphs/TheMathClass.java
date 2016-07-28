package oop_2_18.common.presentation.paragraphs;

public class TheMathClass {

	/*
	 * Paragraph: The Math Class. 
	 * Slides: 4-12
	 */
	public static void demo() {
		mathClass5();
//		mathClass6();
//		mathClass7();
//		mathClass8();
	}

	// Slide # 5: Basic Math Methods
	private static void mathClass5() {
		double x = -5.375;
		double y1 = Math.abs(x);
		double y2 = Math.ceil(x);
		double y3 = Math.floor(x);
		double y4 = Math.rint(x);
		long y5 = Math.round(x);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		System.out.println("y4 = " + y4);
		System.out.println("y5 = " + y5);
	}

	// Slide # 6: Exponential and Logarithmic Methods
	private static void mathClass6() {
		double x = 10;
		double y1 = Math.exp(x);
		double y2 = Math.log(x);
		double y3 = Math.pow(x, 2);
		double y4 = Math.sqrt(x);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		System.out.println("y4 = " + y4);
	}

	// Slide # 7: Trigonometric Methods
	private static void mathClass7() {
		double x = Math.toRadians(90);
		double y1 = Math.sin(x);
		double y2 = Math.cos(x);
		double y3 = Math.tan(x);
		double y4 = Math.toDegrees(x);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		System.out.println("y4 = " + y4);
	}

	// Slide # 8: The random() method
	private static void mathClass8() {
		double rndnum1 = Math.random();
		double rndnum2 = Math.random() * 10;
		int rndnum3 = (int) (Math.random() * 100);
		System.out.println(rndnum1);
		System.out.println(rndnum2);
		System.out.println(rndnum3);
	}
}
