package solid.ocp.good_ocp;

import java.util.*;

/*
 * OCPClient - now independence of any number of kinds of server classes, 
 *             because list of AbstractServer type.
 */
public class OCPClient {
	
	private String clientName;
	private List<AbstractServer> userServers;
	
	public OCPClient(String clientName, AbstractServer... servers) {
		this.clientName = clientName;
		userServers = new LinkedList<>();
		userServers.addAll(Arrays.asList(servers));
		
	}

	public void printServer() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		String userServersList = "";
		for(AbstractServer server : userServers)
			userServersList += server.toString() + "\n";
		return String.format("Client: %s%n%s%n", clientName, userServersList);
	}
	
	
}
