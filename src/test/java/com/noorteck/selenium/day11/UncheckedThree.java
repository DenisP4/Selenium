package com.noorteck.selenium.day11;

public class UncheckedThree {

	public static void main(String[] args) {
		
		String str= null;
		
		try {
			System.out.println("String length:" + str.length());
			
		}catch (Exception e) {
			System.out.println("Your String has anull value");
			e.printStackTrace();
		}
	}
}
