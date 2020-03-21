package ua.lviv.iot.officeTools.model;

public class Ruler extends AbstractOfficeTool {

	private int lengthInCm;
	
	public Ruler(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams,
			int warrantyInDays) {
		super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
	}
	

	public Ruler(int weightInGrams) {
		super(weightInGrams);
	}


	public int getLengthInCm() {
		return lengthInCm;
	}

	public void setLengthInCm(int lengthInCm) {
		this.lengthInCm = lengthInCm;
	}

}
