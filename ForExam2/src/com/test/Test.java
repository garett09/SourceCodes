package com.test;

public class Test {
	public static void main (String [] args) {
		A b = new B ();
		System.out.println(" x = " + b.getResult(0,1));
	}
}

class B extends A {
	final public int getResult (int a, int b) {
		return a + b;
	}
	class A extends Test {
		public int getResult (int a, int b) {
			return a*b;
		}
	}
}
