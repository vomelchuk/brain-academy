package _3_2_serialization.presentation._25_32.not_inherited;

public class Pearson {

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
}
