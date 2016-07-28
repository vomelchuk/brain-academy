package _3_2_serialization.presentation._40_43;

import java.io.*;

public class User implements Externalizable {
	private int id;
	private String username;
	private String email;
	
	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public User() {
	}

	public User(int id, String username, String email) {
		this.id = id;
		this.username = username;
		this.email = email;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(username);
		out.writeObject(email);
	}
	
	@Override
	public void readExternal(ObjectInput in) 
			                         throws IOException,ClassNotFoundException {
		id = in.readInt();
		username = (String) in.readObject();
		email = (String) in.readObject();
	}
}
