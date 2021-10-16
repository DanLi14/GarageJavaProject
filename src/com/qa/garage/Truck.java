package com.qa.garage;

public class Truck extends Vehicle {

	private int payload;
	private String bodyType;

	public Truck(float engineSize, int numOfSeats, String manufacturer, int topSpeed, int id, int payload,
			String bodyType) {
		super(engineSize, numOfSeats, manufacturer, topSpeed, id);
		this.payload = payload;
		this.bodyType = bodyType;
	}

	public int getPayload() {
		return payload;
	}

	public void setPayload(int payload) {
		this.payload = payload;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	@Override
	public int calculateBill() {
		return 1000 * Truck.super.getTopSpeed();
	}

}
