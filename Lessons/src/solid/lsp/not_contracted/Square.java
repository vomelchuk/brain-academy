package solid.lsp.not_contracted;

public class Square extends Rectangle {
	
	@Override
	public void setWidth(double width) { //need to override not IS-A method
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public void setHeight(double height) { //need to override not IS-A method
		super.setHeight(height);
		super.setWidth(height);
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	@Override
	public String toString() {
		return String.format("\t%s:%nside: %f%narea: %f%n", 
				             kind(), super.getWidth(), area());
	}
}
