package com.noorteck.selenium.day11;

public class UncheckedFour {
	
	public static void main(String[] args) {
		
		int[] numList=new int[5];
		
		try {
			numList[10] = 5;
			//this statement will never execute as exception is raised by above statement 
			System.out.println("Inside try block");
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid Index Number");
			e.printStackTrace();
			
		}catch (NullPointerException e) {
			System.out.println("Your string has a null value");
			e.printStackTrace();
			
		}finally {
			System.out.println("Finally Block");
		}
		System.out.println("outside try-catch-finally block");
	}

}
