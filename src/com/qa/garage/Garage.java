package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicleList = new ArrayList<>();
	ArrayList<Car> carList = new ArrayList<>();
	ArrayList<Yacht> yachtList = new ArrayList<>();
	ArrayList<Truck> truckList = new ArrayList<>();

	Car lambo = new Car(5.2F, 2, "Lamborghini", 189, 1, "automatic");
	Car aston = new Car(4.7F, 2, "AstonMartin", 169, 2, "automatic");

	Yacht luminosity = new Yacht(6.0F, 27, "Benetti", 10, 1, "107.6M");
	Yacht ace = new Yacht(2.0F, 10, "Lurssen", 14, 2, "85M");
	
	Truck eddie = new Truck(4.0F, 3, "Mercedes", 79, 1, 2, "Curtain sides with tail lift" );
	Truck bean = new Truck(3.9F, 3, "Fiat", 69, 2, 4, "	Curtain sides /Sliding Roof" );
	
	
	
}
