package com.qa.garage;

public class Truck extends Vehicle {

	int id;
	int payload;
	String bodyType;

	public Truck(float engineSize, int numOfSeats, String manufacturer, int topSpeed, int id, int payload, String bodyType) {
		super(engineSize, numOfSeats, manufacturer, topSpeed);
		this.id = id;
		this.payload = payload;
		this.bodyType = bodyType;
	}
	
	public int getId() {
		return id;
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
	public String toString() {
		return "Truck [payload=" + payload + ", bodyType=" + bodyType + "]";
	}

}
