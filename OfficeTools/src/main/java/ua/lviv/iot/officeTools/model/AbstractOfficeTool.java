package ua.lviv.iot.officeTools.model;

public class AbstractOfficeTool {
	private String producer;

	private double priceInUAH;
	private Brand brand;
	private Colour colour;
	private int weightInGrams;
	private int warrantyInDays;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public void setPriceInUAH(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public int getWarrantyInDays() {
		return warrantyInDays;
	}

	public void setWarrantyInDays(int warrantyInDays) {
		this.warrantyInDays = warrantyInDays;
	}
}
