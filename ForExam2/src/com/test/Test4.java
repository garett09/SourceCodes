package com.test;
/*
enum Enums {
	A, B,C;
	
	private Enums() {
		System.out.print(1 + " ");
	}
}
*/
public class Test4 {
enum Type{
	CAT ("Cat"), DOG("Dog"), LION ("Lion");
	String st;
	public Type (String st) {
		this.st = st;
	}
}
	public static void main(String r[] ) {
	for (Type type: Type.values()) {
		System.out.println(type.st + " ");
	}

	}

}
