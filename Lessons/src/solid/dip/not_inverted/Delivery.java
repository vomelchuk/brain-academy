package solid.dip.not_inverted;

/*
 * Dependencies not inverted: Delivery class needs overloading deliver() method
 * depending on number of transport classes types 
 */
public class Delivery {
	
	public void deliver(Track track) {
		track.transport();
	}
	
	public void deliver(Plane plane) {
		plane.transport();
	}
}
