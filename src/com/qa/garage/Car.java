package com.qa.garage;

public class Car extends Vehicle {

	private String gearbox;

	public Car(float engineSize, int numOfSeats, String manufacturer, int topSpeed, int id, String gearbox) {
		super(engineSize, numOfSeats, manufacturer, topSpeed, id);
		this.gearbox = gearbox;
	}

	public String getGearbox() {
		return gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	
	@Override
	public int calculateBill() {
		return 1000 * Car.super.getTopSpeed();
	}

}
