package com.eduardo;

public class BMI_Computation {
	BMI_InfoSheet bmi1 = new BMI_InfoSheet();

	public void computation() {
		double heightSquared = bmi1.getHeight() * bmi1.getHeight();
		double comp = bmi1.getWeight() / heightSquared;
		double rounded = Math.round(comp * 1000) / 1000;
		System.out.print("\t     " + "Your BMI is " + rounded);
		if (rounded <= 18.5) {
			System.out.print(" You are underweight");
		} else if (rounded >= 18.5 && rounded <= 24.9) {
			System.out.print(" You are normal!");

		} else if (rounded >= 25 && rounded <= 29.9) {
			System.out.print(" You are overweight!");
		} else if (rounded >= 30) {
			System.out.print(" You are obese!");
		} else {
			System.out.print(" Wrong information!");
		}
	}
}
