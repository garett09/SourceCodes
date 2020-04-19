package com.company;

public class Aircon {
	private double hp;
	private int thermostat;
	private String brand;

	public Aircon(double hp, int thermostat, String brand) {
		this.hp = hp; // this.hp refers to private thermostat
		this.thermostat = thermostat;
		this.brand = brand;
	}

	public void setHp(double newHP) {
		this.hp = newHP;
	}

	public double getHP() { // RETURN TYPE SHOULD ALWAYS BE THE DATA TYPE USED.
		return this.hp;
	}

	public int getThermostat() {
		return this.thermostat;
	}

	public String getBrand() {
		return this.brand;
	}

	public void swing(String direction) {
		System.out.println("This aircon is swinging to the " + direction);
	}

	public void changeTemp(int temp) {
		System.out.println("The temperature of this aircon is " + temp);
	}
}
