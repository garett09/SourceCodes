package com.sample;

public class Manager extends Employee {
	Employee emp;

	public Manager(String n, String j, double s) {
		super(n, j, s);
	}

	public String describe(String employee) {
		return emp.getName() + " is an employee..";
	}
	//public String describe() {
		//return getName() + "is really a/n" + getJob();
	//}

}


