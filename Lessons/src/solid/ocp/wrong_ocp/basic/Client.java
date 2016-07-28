package solid.ocp.wrong_ocp.basic;

public class Client {
	
	private String clientName;
	private Server server;
	
	public Client(String clientName, Server server) {
		this.clientName = clientName;
		this.server = server;
	}
	
	public void printServer() {
		System.out.printf("Client: %s%n%s", clientName, server);
	}
}
