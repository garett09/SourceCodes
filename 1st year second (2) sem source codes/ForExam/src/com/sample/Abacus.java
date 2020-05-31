package com.sample;


	class Abacus {
		int result;
		
		int methodA (int...b) {
			int n =-5;
			for(int c:b) {
				n=-c;
			}
			return result;
			}
		int methodA (int a) {
			int n=10;
			result = n++;
			return n;
	}
		public String toString() {
			return "" + result;
			
		}
	
	}
	class Calculator extends Abacus{
		int methodA (int x, int y) {
			result = x+2*y*2;
			return result;
		}
	}
	

