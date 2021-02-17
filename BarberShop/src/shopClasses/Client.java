package shopClasses;

import enumPackage.Products;
import enumPackage.Services;

public class Client extends User {
	private int clientId;
	Employee worker;
	Services serv;
	public int getClientId() {
		return clientId;
	}

	public Client(int clientId, String name, String surname) {
		this.clientId = clientId;
		super.setName(name);
		super.setSurname(surname);
	}
	
	public void setAppointment(Employee worker,Services serv) {
		System.out.println(" Hello  "+super.getName()+"\n You set an appointment with : "+worker.getName()+
				"\n for a "+serv.name()+". \n Thank you very much.\n The price will be : "+worker.getPriceFromEmployee(serv));
	}
	public void buyStuff(Products prod) {
		System.out.println(" Thank you Very much "+super.getName()+" \n You just purchased : "+prod.name()+"\n With the price of : "+prod.getPrice());
	}
}
