package oop_2_19.additional.examples.associations.weak;

public class User {
	
	private String name;
	private String login;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private User(String name, String login, String password) {
		this.name = name;
		this.login = login;
		this.password = password;
	}
	
	public static class UserConfigurator {
		
		public static User getUser(String name, String login, String password) {
			return new User(name, login, password);
		}
	}
}
