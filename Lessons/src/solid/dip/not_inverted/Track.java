package solid.dip.not_inverted;

public class Track {

	public void transport() {
		System.out.println("Cargo has been delivered by " + 
	                       getClass().getSimpleName());
	}
}
