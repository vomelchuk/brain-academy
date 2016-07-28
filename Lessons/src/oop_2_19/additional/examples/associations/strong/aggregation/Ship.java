package oop_2_19.additional.examples.associations.strong.aggregation;

public class Ship {

	private ShipEngine engine;
	private ShipAnchor anchor;
	
	public ShipEngine getEngine() {
		return engine;
	}

	public void setEngine(ShipEngine engine) {
		this.engine = engine;
	}

	public ShipAnchor getAnchor() {
		return anchor;
	}

	public void setAnchor(ShipAnchor anchor) {
		this.anchor = anchor;
	}
	
	public void newConfiguration(ShipEngine engine, ShipAnchor anchor) {
		this.engine = engine;
		this.anchor = anchor;
	}

	public Ship(ShipEngine engine, ShipAnchor anchor) {
		this.engine = engine;
		this.anchor = anchor;
	}

	@Override
	public String toString() {
		return "\t\tShip:\n" + engine + anchor;
	}
}
