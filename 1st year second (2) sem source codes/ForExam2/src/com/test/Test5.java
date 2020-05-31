package com.test;

public class Test5 {

	public static void main(String[] args) {
		Long abc = 200L;
		Long bca = 199L;
		Long cab = 100L;
		if ((abc>bca) || ((cab*3) ==abc))
			System.out.print("ABC");
		else if ((bca+1 !=abc) || ((cab*3) ==bca))
			System.out.print("BCA");
			System.out.print("CAB");
	}

}
