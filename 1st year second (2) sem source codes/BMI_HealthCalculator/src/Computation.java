
public class Computation extends InfoSheet {

	double height, weight;

	public Computation(String nameE, String genderR, int ageE, double height, double weight) {
		super(nameE, genderR, ageE);
		this.height = height;
		this.weight = weight;

	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight() {
		this.height = height;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeigth() {
		this.weight = weight;
	}

	public void computation() {
		double heightSquared = getHeight() * getHeight();
		double comp = getWeight() / heightSquared;
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

	public void display() {
		System.out.println(" Your height and weight is not proportional ");
	}
}
