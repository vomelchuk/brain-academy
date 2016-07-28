package solid.srp.single_responsibility.implementation;

import solid.srp.single_responsibility.DataChannel;

public class Communicator implements DataChannel {
	
	private Connector connector;
	private String phoneNumber;
	
	public Communicator(Connector connector) {
		this.connector = connector;
		
	}
	
	public void connect(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		connector.dial(phoneNumber);
		connector.hangup();
		System.out.println("Connected to " + phoneNumber);
	}

	@Override
	public void send(String data) {
		System.out.println("\"" + data + "\" sended to " + phoneNumber);
	}

	@Override
	public String recv() {
		return "Incomming data: \"Hi there!\"";
	}

}
