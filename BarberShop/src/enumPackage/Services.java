package enumPackage;

public enum Services {
	HAIR_CUT(), BEARD_CUT(), MUSTACHE_TRIM();
	
	private double price;
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
	
}
