package solid.ocp.wrong_ocp.basic;

public class Server {
	
	private String serverName;

	public Server(String serverName) {
		this.serverName = serverName;
	}

	@Override
	public String toString() {
		return "Server: " + serverName + "\n\n";
	}	
}
