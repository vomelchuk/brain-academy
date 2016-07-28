package oop_2_19.additional.examples.associations.strong.multiplicity;

import java.util.Arrays;

public class AirPortRace {
	
	private int numberOfPassengers;
	private String raceName;

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public AirPortRace(String raceName, Passenger... passengers) {
		this.numberOfPassengers = passengers.length;
		this.raceName = raceName;
	}

	@Override
	public String toString() {
		return "AirPortRace " + raceName 
			+ " numberOfPassengers: " + numberOfPassengers + "\n";
	}
	
	
}
