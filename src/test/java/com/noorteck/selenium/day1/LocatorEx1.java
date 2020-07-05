package com.noorteck.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx1 {
	
	public static void main(String[] args) {
		
		//Set System Property 
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\driver\\chromedriver.exe");
		
		//Create driver object
		
		WebDriver driver= new ChromeDriver();
		
		//
		
		driver.get("http://automationpractice.com/index.php");
		
		// find the text field element and enter the value
	
		driver.findElement(By.id("search_query_top")).sendKeys("Shoes");
		
		//find the button element and click
		driver.findElement(By.name("submit_search")).click();
		
		
	}

}
