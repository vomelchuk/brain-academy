package _3_2_serialization.presentation._35_37;

import java.io.*;

public class Student implements Serializable {
	
	protected String firstName;
	protected String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		System.out.println("Constructor");

	}
	
	private void writeObject(ObjectOutputStream o) throws IOException {
		o.writeObject(firstName);
		o.writeUTF(lastName);
		o.writeInt(age);
	}
	
	private void readObject(ObjectInputStream o) 
			                        throws IOException, ClassNotFoundException {
		firstName= (String) o.readObject();
		lastName= o.readUTF();
		age = o.readInt();
	}
}
