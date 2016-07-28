package solid.lsp;

/*
 *     The Liskov Substitution Principle is just an extension of the Open Close 
 * Principle and it means that we must make sure that new derived classes are 
 * extending the base classes without changing their behavior.
 */
public class LiskovSubstitutionMain {

	public static void main(String[] args) {
		//notContractedLSPDemo();
		contractedLSPDemo();
	}
	
	private static void notContractedLSPDemo() {
		solid.lsp.not_contracted.Rectangle[] rectangles = {
				new solid.lsp.not_contracted.Rectangle(5, 4), 
				new solid.lsp.not_contracted.Square(3)
		};
		
		for(solid.lsp.not_contracted.Rectangle rectangle : rectangles) {
			System.out.printf("%s with sides %s and %s area: %s%n", 
					         rectangle.kind(), rectangle.getWidth(), 
					         rectangle.getHeight(), rectangle.area()); /* ->
					                         * -> not IS-A behavior of Square */
			}
	}
	
	private static void contractedLSPDemo() {
		solid.lsp.contracted.Shape[] shapes = {
				new solid.lsp.contracted.Rectangle(5, 4), 
				new solid.lsp.contracted.Square(3)
		};
		
		for(solid.lsp.contracted.Shape shape : shapes) {
			/* custom shape sub-types behavior:
			 *                                 - Rectangle: getWidth()  and 
			 *                                              getHeight() methods;
			 *                                              
			 *                                 - Square: getSide().
			 */
			String shapeSides = shape instanceof solid.lsp.contracted.Rectangle
					                ? "sides " + 
					                  ((solid.lsp.contracted.Rectangle)shape)
					                                               .getWidth() +
					                  " and " + 
					                  ((solid.lsp.contracted.Rectangle)shape)
                                                                   .getHeight()                          
					                : "side " + 
							                ((solid.lsp.contracted.Square)shape)
                                                                    .getSide();
                                                                   
            /* common shape sub-types behavior: kind() and area() methods */
			System.out.printf("%s with %s area: %s%n", 
					          shape.kind(), shapeSides, shape.area());
			
		}
	}
}
