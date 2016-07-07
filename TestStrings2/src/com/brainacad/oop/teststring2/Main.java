package com.brainacad.oop.teststring2;

public class Main {

	public static void main(String[] args) {

		String myStr1 = "Cartoon";
		String myStr2 = "Tomcat";
		System.out.println("mysStr1: " + myStr1);
		System.out.println("mysStr2: " + myStr2);
		System.out.print("Absent letters from myStr1 in myStr2: ");

		for (int i = 0; i < myStr1.length(); i++) {
			boolean isThere = false;
			for (int j = 0; j < myStr2.length(); j++) {
				if (myStr1.charAt(i) == myStr2.charAt(j)) {
					isThere = true;
					break;
				}
			}
			if (!isThere) {
				System.out.print(myStr1.charAt(i));
			}
		}
	}

}
