package solid.ocp.wrong_ocp.addictional;

public class ModifiedClient {
	
	private String clientName;
	private RepositoryServer repServer;
	private DeploymentServer depServer; //added new kind of server class field
	
	public ModifiedClient setRepServer(RepositoryServer repServer) {
		this.repServer =  repServer;
		return this;
	}
	
	public ModifiedClient setDepServer(DeploymentServer depServer) {
		this.depServer = depServer;
		return this;
	}
	
	public ModifiedClient(String clientName, RepositoryServer repServer) {		
		this.clientName = clientName;
		this.repServer = repServer;
		this.depServer = depServer;
	}
	
	/* added new constructor overloaded version for new kind of server class */
	public ModifiedClient(String clientName, DeploymentServer depServer) {
		this.clientName = clientName;
		this.repServer = repServer;
		this.depServer = depServer;
	}

	public void printServer() {
		System.out.printf("Client: %s%n%s%n%s%n", 
				          clientName, 
				          repServer.toString() != null 
				              ? repServer.toString() 
				              : "",
				          depServer.toString() != null 
				              ? depServer.toString() 
				              : "");
	}
}
