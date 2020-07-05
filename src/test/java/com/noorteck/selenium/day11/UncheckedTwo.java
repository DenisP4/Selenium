package com.noorteck.selenium.day11;

public class UncheckedTwo {

	
	public static void main(String[] args) {
		
		int a =10;
		int b = 0;
		
		try {
			/**
			 * We suspect that this block of statement can throw exception 
			 * 
			 * so we handle it by placing these statement inside try 
			 * and the exception in catch block
			 * 
			 * 
			 */
		
			int total = a/b;
			System.out.println("Total:" + total);
			
		}catch (ArithmeticException e) {
			
			/**
			 * 
			 * this block will only execute if any arithmetic exception 
			 * occurs in try block
			 */
			//System.out.println("Cannot divide a number by zero");
			//e.printStackTrace();
			System.out.println("Cannot divide a number by zero\n");
			System.err.println("Cannot divide a number by zero\n");
			
			System.out.println("Get Message:" + e.getMessage());
		}
		
		System.out.println("Outside try catch");
		System.out.println("Program keeps executing....");
		
	}
}
