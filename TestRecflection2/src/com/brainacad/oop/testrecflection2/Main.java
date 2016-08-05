package com.brainacad.oop.testrecflection2;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

	private char[] values = { 'a', 'b', 'c', 'd' };

	public static void main(String[] args) {

		Main m = new Main();
		System.out.println(Arrays.toString(m.values));
		Field privateValues;
		try {
			privateValues = Main.class.getDeclaredField("values");
			privateValues.set(m, new char[] { 'z', 'x', 'c', 'v' });
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(m.values));
	}

}
