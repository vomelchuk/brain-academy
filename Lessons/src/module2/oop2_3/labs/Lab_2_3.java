package module2.oop2_3.labs;

import module2.oop2_3.labs.lab1.MyWindow;
import module2.oop2_3.labs.lab2.Window;



public class Lab_2_3 {

	public static void demo() {
		// lab_2_3_1();
		lab_2_3_3();

	}

	public static void lab_2_3_1() {
		MyWindow window1 = new MyWindow();
		System.out.println(window1);

	}

	public static void lab_2_3_3() {
		Window window1 = new Window(10,15);
		System.out.println(window1);

	}

}
