package com.qa.runner;

import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Truck;
import com.qa.garage.Yacht;

public class Runner {

	public static void main(String[] args) {

		Car lambo = new Car(5.2F, 2, "Lamborghini", 189, 0, "automatic");
		Car aston = new Car(4.7F, 2, "AstonMartin", 169, 1, "automatic");

		Yacht luminosity = new Yacht(6.0F, 27, "Benetti", 10, 2, "107.6M");
		Yacht ace = new Yacht(2.0F, 10, "Lurssen", 14, 3, "85M");
		

		Truck eddie = new Truck(4.0F, 3, "Mercedes", 79, 1, 4, "Curtain sides with tail lift");
		Truck bean = new Truck(3.9F, 3, "Fiat", 69, 2, 5, "Curtain sides /Sliding Roof");

		Garage mygarage = new Garage();

		System.out.println(Garage.calculateBill(ace));
		mygarage.addVehicle(aston);
		mygarage.readOne(ace);
		mygarage.addVehicle(ace);
		mygarage.addVehicle(bean);
		mygarage.readArray();
		mygarage.readById(0);
		mygarage.emptyGarage();
		mygarage.readArray();
	}

}
