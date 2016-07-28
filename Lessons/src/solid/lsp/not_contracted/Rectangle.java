package solid.lsp.not_contracted;

public class Rectangle {
	
	private double width;
	private double height;
	
	public final double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public final double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(final double width, final double height) {
		this.width = width;
		this.height = height;
	}

	public String kind() {
		return getClass().getSimpleName();
	}

	public double area() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return String.format("\t%s:%nwidth: %f%nheight: %f%narea: %f%n", 
				             kind(), width, height, area());
	}
}
