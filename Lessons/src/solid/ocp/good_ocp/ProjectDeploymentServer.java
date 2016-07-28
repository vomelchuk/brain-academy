package solid.ocp.good_ocp;

public class ProjectDeploymentServer extends AbstractServer {

	public ProjectDeploymentServer(String serverName) {
		super(serverName);
	}

	@Override
	public String toString() {
		return "Deployment Server: " + super.getServerName();
	}
	
	
}
