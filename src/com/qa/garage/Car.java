package com.qa.garage;

public class Car extends Vehicle {

	int id;
	String gearbox;

	public Car(float engineSize, int numOfSeats, String manufacturer, int topSpeed, int id, String gearbox) {
		super(engineSize, numOfSeats, manufacturer, topSpeed);
		this.id = id;
		this.gearbox = gearbox;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGearBox() {
		return gearbox;
	}

	public void setGearBox(String speedType) {
		this.gearbox = speedType;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", speedType=" + gearbox + "]";
	}
	
	

}
