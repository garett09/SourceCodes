package com.sample;

public class Employee {
	private String name, job;
	double salary;

	public Employee(String name, String job, double salary) {
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	//public String getJob() {
		//return job;
	//}
//
	public String describe() {
		return "Salary of " +getName() + " is" + salary;
	}
}
