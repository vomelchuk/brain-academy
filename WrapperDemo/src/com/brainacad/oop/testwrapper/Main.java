package com.brainacad.oop.testwrapper;

public class Main {

	public static void main(String[] args) {
		System.out
				.println("x1=15, x2=new Integer(15), x3=Integer.valueOf(15), x4=Integer.parseInt(\"15\")");
		Integer x1 = 15;
		Integer x2 = new Integer(15);
		Integer x3 = Integer.valueOf(15);
		Integer x4 = Integer.parseInt("15");

		System.out.println("x1 == x2: " + (x1 == x2) + "\tx1.equals(x2): "
				+ x1.equals(x2));
		System.out.println("x1 == x3: " + (x1 == x3) + "\tx1.equals(x3): "
				+ x1.equals(x3));
		System.out.println("x1 == x4: " + (x1 == x4) + "\tx1.equals(x4): "
				+ x1.equals(x4));
		System.out.println("x3 == x4: " + (x3 == x4) + "\tx3.equals(x4): "
				+ x3.equals(x4));

		System.out
				.println("\ny1=315, y2=new Integer(315), y3=Integer.valueOf(315), y4=Integer.parseInt(\"315\")");
		Integer y1 = 315;
		Integer y2 = new Integer(315);
		Integer y3 = Integer.valueOf(315);
		Integer y4 = Integer.parseInt("315");

		System.out.println("y1 == y2: " + (y1 == y2) + "\ty1.equals(y2): "
				+ (y1.equals(y2)));
		System.out.println("y1 == y3: " + (y1 == y3) + "\ty1.equals(y3): "
				+ (y1.equals(y3)));
		System.out.println("y1 == y4: " + (y1 == y4) + "\ty1.equals(y3): "
				+ (y1.equals(y3)));
		System.out.println("y3 == y4: " + (y3 == y4) + "\ty3.equals(y3): "
				+ (y3.equals(y3)));
	}

}
