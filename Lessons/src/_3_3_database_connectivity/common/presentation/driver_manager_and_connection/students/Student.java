package _3_3_database_connectivity.common.presentation.driver_manager_and_connection.students;

public class Student {
	
	private String firstName;
	private String lastName;
	private double rate;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getRate() {
		return rate;
	}
	
	public Student(String firstName, String lastName, double rate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rate = rate;
	}
}
