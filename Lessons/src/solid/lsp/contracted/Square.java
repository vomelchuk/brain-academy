package solid.lsp.contracted;

public class Square implements Shape, HasOnlyOneSide {
	
	private double side;
	
	@Override
	public double getSide() {
		return side;
	}

	@Override
	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public String toString() {
		return String.format("\t%s:%nside: %f%narea: %f%n", 
				             kind(), getSide(), area());
	}

	@Override
	public String kind() {
		return getClass().getSimpleName();
	}

	@Override
	public double area() {
		return side * side;
	}
}
