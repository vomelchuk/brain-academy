package com;

public class Good {

	// fields
	private String name;
	private float price;
	private float weight;

	// constructors
	public Good(String name, float price, float weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	// accessors
	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public float getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	// methods
	@Override
	public String toString() {
		return String.format("%s: name=%s, price=%f, weight=%f%n", getClass().getSimpleName(), name, price, weight);
	}

}
