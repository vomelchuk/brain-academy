package solid.ocp.wrong_ocp.addictional;

public class DeploymentServer {
	
	private String serverName;

	public DeploymentServer(String serverName) {
		this.serverName = "deployment " + serverName;
	}

	@Override
	public String toString() {
		return "Server: " + serverName;
	}
}
