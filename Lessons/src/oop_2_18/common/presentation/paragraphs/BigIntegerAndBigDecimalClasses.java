package oop_2_18.common.presentation.paragraphs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class BigIntegerAndBigDecimalClasses {

	/*
	 * Paragraph: BigInteger and BigDecimal classes. 
	 * Slides: 13-22
	 */
	public static void demo() {
//		 bigIntegerAndBigDecimalClasses_from_15_to_16();
		// bigIntegerAndBigDecimalClasses19();
		// bigIntegerAndBigDecimalClasses20();
		 bigIntegerAndBigDecimalClasses21();
//		bigIntegerAndBigDecimalClasses22();
	}

	// Slide # 15-16: BigInteger Class
	private static void bigIntegerAndBigDecimalClasses_from_15_to_16() {
		BigInteger numberA = new BigInteger("7826457624397659273");
		BigInteger numberB = BigInteger.TEN;
		System.out.println("numberA = " + numberA);
		System.out.println("numberB = " + numberB);
		BigInteger numberC = numberA.add(numberB);
		System.out.println("numberC = " + numberC);
		BigInteger numberD = numberA.multiply(numberC);
		System.out.println("numberD = " + numberD);
		BigInteger numberE = numberC.subtract(numberA);
		System.out.println("numberE = " + numberE);
		BigInteger numberF = numberD.divide(numberC);
		System.out.println("numberF = " + numberF);
		BigInteger numberG = numberA.pow(2);
		System.out.println("numberG = " + numberG);
		BigInteger numberH = numberA.negate();
		System.out.println("numberH = " + numberH);
	}

	// Slide # 19: primitive double loop increment
	private static void bigIntegerAndBigDecimalClasses19() {
		for (double x = 0.1; x < 1.1; x += 0.1) {
			System.out.println(x);
		}
	}

	// Slide # 20: BigDecimal loop increment
	private static void bigIntegerAndBigDecimalClasses20() {
		final BigDecimal zd1 = new BigDecimal("0.1");
		final BigDecimal zd2 = new BigDecimal("1.1");
		for (BigDecimal x = zd1; x.compareTo(zd2) < 0; x = x.add(zd1)) {
			System.out.println(x);
		}
	}

	/*
	 * Slide # 21: MathContext and division of BigDecimal numbers (circulator):
	 *             MathContext.UNLIMITED and ArithmeticException: 
	 *                                     Non-terminating decimal expansion; 
	 *                                     no exact representable decimal result
	 */
	private static void bigIntegerAndBigDecimalClasses21() {
		BigDecimal bigdecA = new BigDecimal(1,MathContext.DECIMAL128);
		BigDecimal bigdecB = new BigDecimal(3,MathContext.DECIMAL128);
		BigDecimal bigdecC = bigdecA.divide(bigdecB,MathContext.DECIMAL128);
		System.out.print(bigdecC);
	}

	/*
	 * Slide # 22: MathContext and division of BigDecimal numbers (circulator):
	 *             specific MathContext: DECIMAL32, DECIMAL64, DECIMAL128
	 */
	private static void bigIntegerAndBigDecimalClasses22() {
		BigDecimal bigA = new BigDecimal(1);
		BigDecimal bigB = new BigDecimal(3);
		BigDecimal b32 = bigA.divide(bigB, MathContext.DECIMAL32);
		BigDecimal b64 = bigA.divide(bigB, MathContext.DECIMAL64);
		BigDecimal b128 = bigA.divide(bigB, MathContext.DECIMAL128);
		System.out.println(b32);
		System.out.println(b64);
		System.out.println(b128);
	}
}
