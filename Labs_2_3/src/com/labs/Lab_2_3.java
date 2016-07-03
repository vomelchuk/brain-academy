package com.labs;

import com.labs.lab1.MyWindow;
import com.labs.lab2.Window;

public class Lab_2_3 {
	public static void demo() {
		lab_2_3_1();
		// lab_2_3_2();
		// lab_2_3_3_and_2_3_4();
		// lab_2_3_5();

	}

	public static void lab_2_3_1() {

		MyWindow[] windows = new MyWindow[5];
		double[] widths = { 10, 20, 30, 40, 50 };
		double[] heights = { 15, 25, 35, 45, 55 };
		int[] numberOfGlasses = { 1, 2, 2, 3, 1, };
		String[] colors = { "green", "blue", "grey", "white", "silver" };
		boolean[] opens = { true, false, false, true, false };

		for (int i = 0; i < windows.length; i++) {
			windows[i] = new MyWindow();
			windows[i].setWidth(widths[i]);
			windows[i].setHeight(heights[i]);
			windows[i].setNumberOfGlass(numberOfGlasses[i]);
			windows[i].setColor(colors[i]);
			windows[i].setOpen(opens[i]);
			System.out.println(windows[i]);
		}

	}

	private static void lab_2_3_2() {

		MyWindow testWindow = new MyWindow();
		System.out.println(testWindow);

	}

	public static void lab_2_3_3_and_2_3_4() {

		Window window1 = new Window(2, 3);
		System.out.println(window1);

		Window window2 = new Window(10, 15, 4);
		System.out.println(window2);

		Window window3 = new Window(5, 6, 2, "blue");
		System.out.println(window3);

		Window window4 = new Window(8, 7, 1, "grey", false);
		System.out.println(window4);

	}

	public static void lab_2_3_5() {

		MyWindow[] windows = new MyWindow[4];
		windows[0] = new MyWindow(10, 20);
		windows[1] = new MyWindow(2, 5, 2);
		windows[2] = new MyWindow(15, 35, 1, "blue");
		windows[3] = new MyWindow(15, 20, 3, "grey", false);

		for (int i = 0; i < windows.length; i++) {
			System.out.println("Window " + (i + 1));
			windows[i].printFields();
		}

	}
}
