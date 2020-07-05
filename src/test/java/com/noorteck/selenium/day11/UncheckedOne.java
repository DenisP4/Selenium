package com.noorteck.selenium.day11;

public class UncheckedOne {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		/**
		 * since we are dividing by zero 
		 * 
		 * it should throw arithmeticException
		 * 
		 * 
		 */
		
		int total = a/b;
		System.out.println(total);
	}

}
