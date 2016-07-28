package solid.dip.inverted;

/*
 * Dependencies inverted: Delivery class no needs overloading deliver() method,
 * because of abstraction - common type for all possible number of transport 
 * classes types
 */
public class Delivery {
	
	public void deliver(Transport transport) {
		transport.transport();
	}
}
