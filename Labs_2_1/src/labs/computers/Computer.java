package labs.computers;

public class Computer {

	// fields members
	private String manufacturer;
	private int serialNumber;
	private float price;
	private int quantityCPU;
	private int frequencyCPU;

	// getters/setters
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantityCPU() {
		return quantityCPU;
	}

	public void setQuantityCPU(int quantityCPU) {
		this.quantityCPU = quantityCPU;
	}

	public int getFrequencyCPU() {
		return frequencyCPU;
	}

	public void setFrequencyCPU(int frequencyCPU) {
		this.frequencyCPU = frequencyCPU;
	}

	// methods members
	public void view() {
		String info = String
				.format("\tManufacturer: %s\n\tS/N: %s\n\tPrice: $%.2f\n\tQuantuty of CPU: %d\n\tFrequency of CPU: %d MHz",
						manufacturer, serialNumber, price, quantityCPU,
						frequencyCPU);
		System.out.println("Specification:\n" + info + "\n");
	}
}
