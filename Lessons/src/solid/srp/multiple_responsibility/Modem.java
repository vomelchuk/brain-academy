package solid.srp.multiple_responsibility;

public interface Modem {
	
	//1st responsibility: connection (dial() and hangup() methods)
	public void dial(String pno);
	public void hangup();
	
	//2nd responsibility: communicate data (send() and recv() methods)
	public void send(char c);
	public char recv();
}
