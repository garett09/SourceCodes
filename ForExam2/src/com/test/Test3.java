package com.test;

public final class Test3 {
	private final String name;
	private final int age;

	public Test3(final String name, final int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;

	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Test3 fpc = new Test3("Oleti ", 24);
		Test3 fc = new Test3 ("Kiran", 25);
		System.out.println(fpc.name + " - " + fpc.age);
		System.out.println(fc.getName() + " - " + fc.getAge());
		
	}

}
