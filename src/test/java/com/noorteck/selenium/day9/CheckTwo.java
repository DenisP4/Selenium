package com.noorteck.selenium.day9;

public class CheckTwo {
	
	public static void main(String[] args) {
		
		//getData();
		try {
			getStr();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getData() {
		try {
			Thread.sleep(1000);
			System.out.println("This is your data");
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void getStr() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("This is your getStr method");
	}
}
