package enumPackage;

public enum Products {
	OILS(20.00), AFTER_SHAVE(20.00), GEL(10.00), TRIMMER(25.50);
	
	private double price;
	
	Products(double d) {
		this.price = d;
	}
	public double getPrice() {
		return this.price;
	}
}
