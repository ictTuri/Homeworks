package shopClasses;

import enumPackage.Products;
import enumPackage.Services;

public class Test {
	public static void main(String[] args) {
		Employee emp1= new Employee("Turi","Molla",23,20.00,20.00,12.00);
		Client cl1 = new Client(12,"Andi","Shkoza");
		cl1.setAppointment(emp1, Services.HAIR_CUT);
		cl1.buyStuff(Products.GEL);
		
		Employee emp2= new Employee("Bert","Halli",23,24.00,25.00,17.00);
		Client cl2 = new Client(12,"Artan","Kulla");
		cl2.setAppointment(emp2, Services.HAIR_CUT);
		cl2.buyStuff(Products.AFTER_SHAVE);
	}
}
