package shopClasses;

import enumPackage.Services;

public class Employee extends User {
	private double hairCutPrice;
	private double beardCutPrice;
	private double mustacheTrimPrice;
	public double getPriceFromEmployee(Services serv) {
		switch(serv) {
			case HAIR_CUT:
				return hairCutPrice;
			case BEARD_CUT:
				return beardCutPrice;
			case MUSTACHE_TRIM:
				return mustacheTrimPrice;
				default :
					return 0.00;
		}
	}
	public void setHairCutPrice(double hairCutPrice) {
		this.hairCutPrice = hairCutPrice;
	}
	public void setBeardCutPrice(double beardCutPrice) {
		this.beardCutPrice = beardCutPrice;
	}
	public void setMustacheTrimPrice(double mustacheTrimPrice) {
		this.mustacheTrimPrice = mustacheTrimPrice;
	}
	Employee(String name, String surname,int age, double hairCut,double beardCut, double mustacheTrim){
		super.setName(name);
		super.setSurname(surname);
		super.setAge(age);
		this.hairCutPrice=hairCut;
		this.beardCutPrice=beardCut;
		this.mustacheTrimPrice=mustacheTrim;
	}
}
