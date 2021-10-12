package com.qa.garage;

public class Vehicle {

	private float engineSize;
	private int numOfSeats;
	private String manufacturer;
	private int topSpeed;

	public Vehicle(float engineSize, int numOfSeats, String manufacturer, int topSpeed) {
		super();
		this.engineSize = engineSize;
		this.numOfSeats = numOfSeats;
		this.manufacturer = manufacturer;
		this.topSpeed = topSpeed;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "Vehicle [engineSize=" + engineSize + ", numOfSeats=" + numOfSeats + ", manufacturer=" + manufacturer
				+ ", topSpeed=" + topSpeed + "]";
	}

}
