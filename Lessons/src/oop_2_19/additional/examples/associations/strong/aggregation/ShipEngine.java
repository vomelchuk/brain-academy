package oop_2_19.additional.examples.associations.strong.aggregation;

public class ShipEngine {
	
	private long serialNumber;
	private float capacity;
	
	public ShipEngine(long serialNumber, float capacity) {
		this.serialNumber = serialNumber;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "ShipEngine:\n"
			 + "\tserialNumber: " + serialNumber 
			 + "\n\tcapacity: " + capacity + "\n";
	}
	
	
}
