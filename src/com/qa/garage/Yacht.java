package com.qa.garage;

public class Yacht extends Vehicle {

	private String boatSize;

	public Yacht(float engineSize, int numOfSeats, String manufacturer, int topSpeed, int id, String boatSize) {
		super(engineSize, numOfSeats, manufacturer, topSpeed, id);
		this.boatSize = boatSize;
	}

	public String getBoatSize() {
		return boatSize;
	}

	public void setBoatSize(String boatSize) {
		this.boatSize = boatSize;
	}
	
	@Override
	public int calculateBill() {
		return 1000000 * Yacht.super.getTopSpeed();
	}


}
