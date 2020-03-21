package ua.lviv.iot.officeTools.model;

public class MagnifyingGlass extends AbstractOfficeTool {

	private int magnificationFactor;

	public MagnifyingGlass(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams,
			int warrantyInDays) {
		super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
	}

	public int getMagnificationFactor() {
		return magnificationFactor;
	}

	public void setMagnificationFactor(int magnificationFactor) {
		this.magnificationFactor = magnificationFactor;
	}

}
