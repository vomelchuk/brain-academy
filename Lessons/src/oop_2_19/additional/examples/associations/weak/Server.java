package oop_2_19.additional.examples.associations.weak;

public class Server {

	private String[] adminParams = { "admin", "admin"};
	
	public void signIn(User user) {
		if(user.getLogin().equals(adminParams[0]) &&
		   user.getPassword().equals(adminParams[1]))
			System.out.println("Hello, Admin!");
		else
			System.out.println("Access denied!!");
			
	}
}
