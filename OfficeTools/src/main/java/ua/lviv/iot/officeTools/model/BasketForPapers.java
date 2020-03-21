package ua.lviv.iot.officeTools.model;

public class BasketForPapers extends AbstractOfficeTool {

	private int volumeInLiter;

	public BasketForPapers(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams,
			int warrantyInDays) {
		super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
	}

	public int getVolumeInLiter() {
		return volumeInLiter;
	}

	public void setVolumeInLiter(int volumeInLiter) {
		this.volumeInLiter = volumeInLiter;
	}

}
