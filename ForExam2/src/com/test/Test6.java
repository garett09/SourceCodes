package com.test;

enum NAMES {
	STUDENT("Kiran"), EMPLOYEE("Ashok"), ENTREPRENEUR("Oleti");

	String str;

	NAMES(String str) {
		this.str = str;
	}
}

public class Test6 {

	public static void main(String[] args) {
		for (NAMES type : NAMES.values()) {
			switch (type.str) {
			case "Kiran":
				System.out.println(type + " ");
			case "Ashok":
				System.out.println(type + " ");
				break;
			case "Oleti":
				System.out.println(type + " ");
				break;

			default:
				System.out.println(type + " ");
				break;
			}

		}

	}
}
