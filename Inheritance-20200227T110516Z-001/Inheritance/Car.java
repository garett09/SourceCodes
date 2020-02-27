package com.lab2;

public class Car {

	private String engine, color;

	public Car(String engine, String color) {
		this.engine = engine;
		this.color = color;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngine() {
		return this.engine;
	}

	public String getColor() {
		return this.color;
	}

	public void accelerate(double acceleration) {
		System.out.println("This car is accelerating at " + acceleration + "kph^2	");

	}

}
