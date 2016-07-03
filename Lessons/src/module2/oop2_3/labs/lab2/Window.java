package module2.oop2_3.labs.lab2;

import module2.oop2_3.labs.lab1.MyWindow;

public class Window {

	private MyWindow window;

	public Window() {
		window = new MyWindow();
	}

	public Window(double width) {
		window = new MyWindow(width);
	}

	public Window(double width, double height) {
		window = new MyWindow(width, height);
	}

	public Window(double width, double height, int numberOfGlass) {
		window = new MyWindow(width, height, numberOfGlass);
	}

	public Window(double width, double height, int numberOfGlass, String color) {
		window = new MyWindow(width, height, numberOfGlass, color);
	}

	public Window(double width, double height, int numberOfGlass, String color,
			boolean open) {
		window = new MyWindow(width, height, numberOfGlass, color, open);
	}

	@Override
	public String toString() {
		return "Window [window=" + window + "]";
	}

}
