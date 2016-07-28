package solid.lsp.contracted;

public class Rectangle implements Shape, HasWidthAndHeight {
	
	private double width;
	private double height;
	
	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(final double width, final double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String kind() {
		return getClass().getSimpleName();
	}

	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return String.format("\t%s:%nwidth: %f%nheight: %f%narea: %f%n", 
				             kind(), getWidth(), getHeight(), area());
	}
}
