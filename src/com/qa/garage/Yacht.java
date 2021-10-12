package com.qa.garage;

public class Yacht extends Vehicle {

	int id;
	String boatSize;

	public Yacht(float engineSize, int numOfSeats, String manufacturer, int topSpeed, int id, String boatSize) {
		super(engineSize, numOfSeats, manufacturer, topSpeed);
		this.id = id;
		this.boatSize = boatSize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBoatSize() {
		return boatSize;
	}

	public void setBoatSize(String boatSize) {
		this.boatSize = boatSize;
	}

	@Override
	public String toString() {
		return "Yacht [id=" + id + ", boatSize=" + boatSize + "]";
	}

}
