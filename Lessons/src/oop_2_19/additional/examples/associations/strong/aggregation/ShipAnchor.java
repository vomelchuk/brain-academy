package oop_2_19.additional.examples.associations.strong.aggregation;

public class ShipAnchor {

	private float weight;

	public ShipAnchor(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "ShipAnchor:\n"
				+ "\tweight: " + weight + "\n";
	}
	
	
}
