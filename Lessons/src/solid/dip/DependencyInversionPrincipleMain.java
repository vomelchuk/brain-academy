package solid.dip;

/*
 *     Dependency Inversion Principle means depend on abstractions, not on 
 * concretions:
 * 
 *            - all member variables in a class must be interfaces or abstracts;
 *            
 *            - all concrete class packages must connect only through interface 
 *              or abstract class packages;
 *              
 *            - no class should derive from a concrete class;
 *            
 *            - no method should override an implemented method;
 *            
 *            - all variable instantiation requires the implementation of a 
 *              creational pattern such as the factory method or the factory 
 *              pattern, or the use of a dependency-injection framework.
 */
public class DependencyInversionPrincipleMain {

	public static void main(String[] args) {
		//not_inverted();
		inverted();
	}
	
	private static void not_inverted() {
		solid.dip.not_inverted.Delivery delivery = 
				                          new solid.dip.not_inverted.Delivery();
		delivery.deliver(new solid.dip.not_inverted.Track());
	}
	
	private static void inverted() {
		solid.dip.inverted.Delivery delivery = 
				                          new solid.dip.inverted.Delivery();
		delivery.deliver(new solid.dip.inverted.Track());
		delivery.deliver(new solid.dip.inverted.Plane());
		delivery.deliver(new solid.dip.inverted.Ship());
	}	
}
