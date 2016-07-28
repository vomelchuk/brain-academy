package solid.ocp.wrong_ocp.addictional;

public class RepositoryServer {
	
	private String serverName;

	public RepositoryServer(String serverName) {
		this.serverName = "repository " + serverName;
	}

	@Override
	public String toString() {
		return "Server: " + serverName;
	}	
}
