package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicleList = new ArrayList<>();

	// For future reference: make abstract - have each of these methods in the subclasses.
	
	public static int calculateBill(Vehicle obj) {
		if (obj.getClass().getSimpleName().equals("Car")) {
			return (int) (20000 * obj.getEngineSize());
		} else if (obj.getClass().getSimpleName().equals("Yacht")) {
			return (int) (1000000 * obj.getNumOfSeats());
		} else if (obj.getClass().getSimpleName().equals("Truck")) {
			return (int) (10000 * obj.getEngineSize());
		} else {
			return 14000;
		}
	}

	public void addVehicle(Vehicle obj) {
		vehicleList.add(obj);
	}
	
	public void readOne(Vehicle obj) {
		System.out.println(obj);
	}
	
	public void readArray() {
		System.out.println(vehicleList);
		System.out.println(vehicleList.size());
	}
	
	// Should have set id in parent class, so can access below by getId Getter... use engine size as a workaround for now.
	public void readById(int id) {
		System.out.println(vehicleList.get(id));
		
	}
	
	public void emptyGarage() {
		vehicleList.clear();
	}
	
	
}
