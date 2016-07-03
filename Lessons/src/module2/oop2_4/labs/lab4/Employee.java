package module2.oop2_4.labs.lab4;

public class Employee {
	// instance fields
	private String firstName;
	private String lastName;
	private String occupation;
	private int telephone;
	// class fields
	private static int numberOfEmployees;

	// constructors
	public Employee(String firstName, String lastName, String occupation,
			int telephone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this.telephone = telephone;
		numberOfEmployees++;
	}

	// accessors
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}

}
