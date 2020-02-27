package com.lab2;

public class Suv extends Car {
	double fuelCapacity;

	public Suv(String engine, String color, double capacity) {

		super(engine, color); // calling from the other class
		this.fuelCapacity = capacity;
	}

	public void setFuelCapacity() {
		this.fuelCapacity = fuelCapacity;
	}

	public double getFuelCapacity() {
		return this.fuelCapacity;
	}

	public void drivetrain(double distance) {
		System.out.println("This SUV can be driven offroad up to a distance of " + distance + "km");
	}
}
