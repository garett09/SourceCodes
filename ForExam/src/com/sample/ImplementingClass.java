package com.sample;

public class ImplementingClass extends AbstractClass {

	public static void main(String[] args) {
		ImplementingClass ic = new ImplementingClass();
		ic.finalMethod();

	}

	@Override
	void astractMethod() {
		System.out.println("implemented abstract method");
		// TODO Auto-generated method stub
		
	}
void finalMethod() {
	System.out.println("change final method");
}
}
