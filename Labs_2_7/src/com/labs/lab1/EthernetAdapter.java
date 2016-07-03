package com.labs.lab1;

public class EthernetAdapter extends Device {
	// fields
	private int speed;
	private String mac;

	// constructors;
	public EthernetAdapter(String manufacturer, float price,
			String serialNumber, int speed, String mac) {
		super(manufacturer, price, serialNumber);
		this.speed = speed;
		this.mac = mac;
	}

	// accessors
	public int getSpeed() {
		return speed;
	}

	public String getMac() {
		return mac;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	@Override
	public String toString() {
		return String
				.format(getClass().getSimpleName()
						+ ": manufacturer = %s, price = %.2f$, serialNumber = %s, speed = %dMbit, mac = %s",
						super.getManufacturer(), super.getPrice(),
						super.getSerialNumber(), speed, mac);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mac == null) ? 0 : mac.hashCode());
		result = prime * result + speed;
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
		EthernetAdapter other = (EthernetAdapter) obj;
		if (mac == null) {
			if (other.mac != null)
				return false;
		} else if (!mac.equals(other.mac))
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

}
