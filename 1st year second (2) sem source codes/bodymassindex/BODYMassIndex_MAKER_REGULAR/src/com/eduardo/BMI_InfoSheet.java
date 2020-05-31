package com.eduardo;

import java.util.Scanner;

public class BMI_InfoSheet {
	private String name;
	private int age;
	private double height, weight;

	public BMI_InfoSheet() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input height in meters and weight in KG");

		System.out.println("Name?");
		name = input.nextLine();
		System.out.println("Age?");
		age = input.nextInt();
		System.out.println("Height in Meters");
		height = input.nextDouble();
		System.out.println("Weight in KG");
		weight = input.nextDouble();

	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getWeight() {
		return this.weight;

	}

	public double getHeight() {
		return this.height;
	}

	public void display() {
		BMI_Computation bmi = new BMI_Computation();
		bmi.computation();
	}

}
