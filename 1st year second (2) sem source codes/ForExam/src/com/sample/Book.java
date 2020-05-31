package com.sample;

public class Book {
	String name;
	Author author;

	public Book(String name, Author a) {
		this.name = name;
		author = a;
	}

	public String getName() {
		return name;

	}

	public String toString() {
		return getName() + " by" + author.name;
	}
}
