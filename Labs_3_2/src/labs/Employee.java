package labs;

import java.io.Serializable;

public class Employee implements Serializable {
	// fields
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private transient int SSN;
	private int number;

	// constructors
	public Employee(String name, String address, int sSN, int number) {
		this.name = name;
		this.address = address;
		SSN = sSN;
		this.number = number;
	}

	// accessors
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSSN() {
		return SSN;
	}

	public int getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// methods
	@Override
	public String toString() {
		return String.format("%s:%n\tName: %s%n\tAddress: %s%n\tSSN: %d%n\tNumber: %d%n", this.getClass().getSimpleName(), name,
				address, SSN, number);
	}

}
