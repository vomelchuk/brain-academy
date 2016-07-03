package module2.oop2_3.labs.lab1;

public class MyWindow {

	// fields
	private double width;
	private double height;
	private int numberOfGlass;
	private String color;
	private boolean open;

	// constructors
	public MyWindow() {
		this(10, 10, 1, "white", true);
	}

	public MyWindow(double width) {
		this(width, 10, 1, "white", true);
	}

	public MyWindow(double width, double height) {
		this(width, height, 1, "white", true);
	}

	public MyWindow(double width, double height, int numberOfGlass) {
		this(width, height, numberOfGlass, "white", true);
	}

	public MyWindow(double width, double height, int numberOfGlass, String color) {
		this(width, height, numberOfGlass, color, true);
	}

	public MyWindow(double width, double height, int numberOfGlass,
			String color, boolean open) {
		this.width = width;
		this.height = height;
		this.numberOfGlass = numberOfGlass;
		this.color = color;
		this.open = open;
	}

	// accessors
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getNumberOfGlass() {
		return numberOfGlass;
	}

	public void setNumberOfGlass(int numberOfGlass) {
		this.numberOfGlass = numberOfGlass;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	@Override
	public String toString() {
		return "MyWindow [width=" + width + ", height=" + height
				+ ", numberOfGlass=" + numberOfGlass + ", color=" + color
				+ ", open=" + open + "]";
	}

}
