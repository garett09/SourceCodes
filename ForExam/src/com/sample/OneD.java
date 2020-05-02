package com.sample;

public class OneD {
	public int method3(int[] x) {
		int b = 3;
		int i = 0;
		for (i = 0; i < x.length - 1; i++) {
			if (x[i] >= x[i + 1]) {
				b = x[i + 1];
				x[i] = x[i];
				x[i + 1] = b;
				continue;
			}
		}
		return b;
	}
}
