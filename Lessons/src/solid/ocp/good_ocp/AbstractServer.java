package solid.ocp.good_ocp;

/*
 * AbstractServer - module class, which is "Closed for Modification", because it 
 *                  abstract and gives access to its own members for derived 
 *                  classes through private and protected modifiers. 
 *                  It is also "Open For Extension" by sub-typing.
 */
public abstract class AbstractServer {
	
	private String serverName;
	
	protected String getServerName() {
		return serverName;
	}

	protected AbstractServer(String serverName) {
		this.serverName = serverName;
	}

	@Override
	public String toString() {
		return "Server: " + serverName;
	}
}
