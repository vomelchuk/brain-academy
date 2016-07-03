package com.labs.lab1;

public class Monitor extends Device {

	// fields
	private int resolutionX;
	private int resolutionY;

	// constructors;
	public Monitor(String manufacturer, float price, String serialNumber,
			int resolutionX, int resolutionY) {
		super(manufacturer, price, serialNumber);
		this.resolutionX = resolutionX;
		this.resolutionY = resolutionY;
	}

	// accessors
	public int getResolutionX() {
		return resolutionX;
	}

	public int getResolutionY() {
		return resolutionY;
	}

	public void setResolutionX(int resolutionX) {
		this.resolutionX = resolutionX;
	}

	public void setResolutionY(int resolutionY) {
		this.resolutionY = resolutionY;
	}

	@Override
	public String toString() {
		return String
				.format(getClass().getSimpleName()
						+ ": manufacturer = %s, price = %.2f$, serialNumber = %s, X = %d, Y = %d",
						super.getManufacturer(), super.getPrice(),
						super.getSerialNumber(), resolutionX, resolutionY);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + resolutionX;
		result = prime * result + resolutionY;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monitor other = (Monitor) obj;
		if (resolutionX != other.resolutionX)
			return false;
		if (resolutionY != other.resolutionY)
			return false;
		return true;
	}

}
