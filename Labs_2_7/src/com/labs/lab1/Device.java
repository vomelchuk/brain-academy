package com.labs.lab1;

public class Device {
	// fields
	private String manufacturer;
	private float price;
	private String serialNumber;

	// constructors;
	protected Device(String manufacturer, float price, String serialNumber) {
		this.manufacturer = manufacturer;
		this.price = price;
		this.serialNumber = serialNumber;
	}

	// accessors
	protected String getManufacturer() {
		return manufacturer;
	}

	protected float getPrice() {
		return price;
	}

	protected String getSerialNumber() {
		return serialNumber;
	}

	protected void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	protected void setPrice(float price) {
		this.price = price;
	}

	protected void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return String.format(getClass().getSimpleName()
				+ ": manufacturer = %s, price = %.2f$, serialNumber = %s",
				manufacturer, price, serialNumber);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result
				+ ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}

}
