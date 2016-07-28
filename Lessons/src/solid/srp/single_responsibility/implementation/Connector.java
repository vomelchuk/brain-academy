package solid.srp.single_responsibility.implementation;

import solid.srp.single_responsibility.Connection;

public class Connector implements Connection {
	
	private boolean dialing;
	private boolean connected;
	
	public boolean isConnected() {
		return connected;
	}

	@Override
	public void dial(String pno) {
		dialing = true;
		System.out.println("Dialing...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void hangup() {
		if(dialing) {
			connected = true;
			System.out.println("Hangup!"); 
		}
		else
			System.out.println("Cannot hangup. Try to dial first!");
	}

}
