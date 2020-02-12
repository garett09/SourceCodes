package BMI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

    private String name;
    private int age;
    private double height, weight;

    BMI() {
        System.out.println("Please input height in meters and weight in KG");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Name?");
        name = input.next();
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

    void computation() {
        double heightSquared = height * height;
        double comp = this.weight / heightSquared;
        double rounded = Math.round(comp * 1000) / 1000;
        System.out.print("\t     " +"Your BMI is " + rounded);
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

    void display() {
        computation();
    }
}

    
