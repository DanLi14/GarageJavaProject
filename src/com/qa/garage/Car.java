package com.qa.garage;

public class Car extends Vehicle {

	int id;
	String speedType;

	public Car(float engineSize, int numOfSeats, String manufacturer, int topSpeed, int id, String speedType) {
		super(engineSize, numOfSeats, manufacturer, topSpeed);
		this.id = id;
		this.speedType = speedType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpeedType() {
		return speedType;
	}

	public void setSpeedType(String speedType) {
		this.speedType = speedType;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", speedType=" + speedType + "]";
	}
	
	

}
