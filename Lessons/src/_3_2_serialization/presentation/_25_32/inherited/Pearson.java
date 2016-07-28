package _3_2_serialization.presentation._25_32.inherited;

import java.io.Serializable;

public class Pearson implements Serializable {

	protected String firstName;
	protected String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Pearson() {
		System.out.println("Pearson");
	}

	public Pearson(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Pearson");
	}
}
