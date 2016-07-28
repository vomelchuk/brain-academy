package solid.dip.inverted;

public class Ship  implements Transport {
	
	@Override
	public void transport() {
		System.out.println("Cargo has been delivered by " + 
	                       getClass().getSimpleName());
	}
}
