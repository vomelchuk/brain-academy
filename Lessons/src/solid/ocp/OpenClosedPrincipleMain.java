package solid.ocp;

import solid.ocp.good_ocp.*;
import solid.ocp.wrong_ocp.addictional.*;
import solid.ocp.wrong_ocp.basic.*;

public class OpenClosedPrincipleMain {

	public static void main(String[] args) {
		//wrongOCPDemo();
		goodOCPDemo();
	}
	
	private static void wrongOCPDemo() {
		Server server = new Server("Concrete");
		Client client = new Client("Novice", server);
		client.printServer();
		
		RepositoryServer repServer = new RepositoryServer("Floppy disk");
		DeploymentServer depServer = new DeploymentServer("MS DOS");
		ModifiedClient modifiedClient = 
				new ModifiedClient("Google", repServer).setDepServer(depServer);
		modifiedClient.printServer();
	}
	
	private static void goodOCPDemo() {
		AbstractServer repServer = 
				                new ProjectRepositoryServer("Quantum Super PC");
		AbstractServer depServer = new ProjectDeploymentServer("Universum-net");
		OCPClient ocpClient = new OCPClient("Oracle", repServer, depServer);
		ocpClient.printServer();
	}
}
