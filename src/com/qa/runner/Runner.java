package com.qa.runner;

import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Truck;
import com.qa.garage.Yacht;

public class Runner {

	public static void main(String[] args) {

		// Objects
		Garage mygarage = new Garage();
		Car lambo = new Car(5.2F, 2, "Lamborghini", 189, 1, "automatic");
		Car aston = new Car(4.7F, 2, "AstonMartin", 169, 2, "automatic");
		Yacht luminosity = new Yacht(6.0F, 27, "Benetti", 10, 3, "107.6M");
		Yacht ace = new Yacht(2.0F, 10, "Lurssen", 14, 4, "85M");
		Truck bean = new Truck(3.9F, 3, "Fiat", 69, 5, 750, "Curtain sides /Sliding Roof");

		System.out.println(mygarage.runCalculateBill(aston));
		System.out.println(mygarage.runCalculateBill(ace));
		System.out.println(mygarage.runCalculateBill(bean));
		System.out.println(mygarage.addVehicle(lambo));
		System.out.println(mygarage.addVehicle(aston));
		System.out.println(mygarage.addVehicle(luminosity));
		System.out.println(mygarage.addVehicle(ace));
		System.out.println(mygarage.addVehicle(bean));
		System.out.println(mygarage.removeById(2));
		System.out.println(mygarage.emptyGarage());

	}

}
