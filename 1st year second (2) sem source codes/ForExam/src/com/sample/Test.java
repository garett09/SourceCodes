package com.sample;

public class Test {
	public static void main(String[] args) {
		Abacus a = new Calculator();
		Calculator c = new Calculator();
		c.methodA(5, 6);
		a = c;
		System.out.println(a.result);
	}
}