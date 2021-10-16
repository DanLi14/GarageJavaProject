package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	// Attributes
	ArrayList<Vehicle> vehicleList = new ArrayList<>();

	// Car Objects
	// Car(float engineSize, int numOfSeats, String manufacturer, int topSpeed, int
	// id, String gearbox)
	Car lambo = new Car(5.2F, 2, "Lamborghini", 189, 0, "automatic");
	Car aston = new Car(4.7F, 2, "AstonMartin", 169, 1, "automatic");

	// Yacht Objects
	// Yacht(float engineSize, int numOfSeats, String manufacturer, int topSpeed,
	// int id, String boatSize)
	Yacht luminosity = new Yacht(6.0F, 27, "Benetti", 10, 2, "107.6M");
	Yacht ace = new Yacht(2.0F, 10, "Lurssen", 14, 3, "85M");

	// Truck Objects
	// Truck(float engineSize, int numOfSeats, String manufacturer, int topSpeed,
	// int id, int payload,String bodyType)
	Truck eddie = new Truck(4.0F, 3, "Mercedes", 79, 4, 500, "Curtain sides with tail lift");
	Truck bean = new Truck(3.9F, 3, "Fiat", 69, 5, 750, "Curtain sides /Sliding Roof");

	// if (obj.getClass().getSimpleName().equals("Car")) {
	// return (int) (20000 * obj.getEngineSize());

	public int runCalculateBill(Vehicle obj) {

		return obj.calculateBill();

	}

	public ArrayList<Vehicle> addVehicle(Vehicle obj) {
		vehicleList.add(obj);
		return vehicleList;
	}

	public ArrayList<Vehicle> removeById(int id) {
		for (Vehicle i : vehicleList) {
			if (i.getId() == id) {
				vehicleList.remove(id - 1);
				break;
			} else {
				continue;
			}
		}
		return vehicleList;
	}

	public ArrayList<Vehicle> emptyGarage() {
		vehicleList.clear();
		return vehicleList;
	}

}
