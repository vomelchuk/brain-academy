package _3_2_serialization.labs._3_2_1_and_2;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String address;
	private int SSN;
	private int number;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public Employee(String name, String address, int sSN, int number) {
		this.name = name;
		this.address = address;
		this.SSN = sSN;
		this.number = number;
	}
	
	
	@Override
	public String toString() {
		return String.format("Employee:%nname: %s%naddress: %s%nSSN: %d%n"
				           + "number: %d%n",  name, address, SSN, number);
	}
}
