package solid.srp.single_responsibility;

/*
 * Single responsibility: communicate data (send() and recv() methods)
 */
public interface DataChannel extends Modem {

	public void send(String data);

	public String recv();
}
