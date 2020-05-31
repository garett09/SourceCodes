package com.test;

public class Test8 {
	
	public void sameClass (Integer i) {
		System.out.println("Integer sameClass");
	}
	public void sameClass (int i) {
		System.out.println("int sameClass");
	}
	public static void main (String args[]) {
		new Test() .sameClass(8);
	}
}
