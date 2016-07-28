package solid.srp.single_responsibility;

/*
 * Single responsibility: connection (dial() and hangup() methods)
 */
public interface Connection extends Modem {
	
	public void dial(String pno);

	public void hangup();
}
