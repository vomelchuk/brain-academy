package solid.ocp.good_ocp;

public class ProjectRepositoryServer extends AbstractServer {

	public ProjectRepositoryServer(String serverName) {
		super(serverName);
	}
	
	@Override
	public String toString() {
		return "Repository Server: " + super.getServerName();
	}
}
