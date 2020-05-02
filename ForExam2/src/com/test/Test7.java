package com.test;

public class Test7 {

	public static void main(String[] args) {
	Integer [] ints =  {10,9,12};
	for(int i=2;i>=0;i--) {
		if(ints[i] instanceof Integer) {
			System.out.println(ints [i] + " ");
		}
	}

	}

}
