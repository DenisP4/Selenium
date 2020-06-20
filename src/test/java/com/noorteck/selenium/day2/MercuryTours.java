package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "http://newtours.demoaut.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		
		//Verify the page title is “Register: Mercury Tours”
		String expectedTitle="Register: Mercury Tours";
		
		String pageTitle=driver.getTitle();
		
		if(expectedTitle.equals(pageTitle)) {
			System.out.println("The page Title verified");
		}else {
			System.out.println("The page Title failed");
		}
		
		Thread.sleep(5000);
		
		//Enter first name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Denis");
		//Enter last name
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Putina");
		////enter phone number
		driver.findElement(By.name("phone")).sendKeys("7038259700");
		//enter email address
		driver.findElement(By.id("userName")).sendKeys("denis_putina@yahoo.com");
		// enter address
		driver.findElement(By.name("address1")).sendKeys("4950 Sunset ln");
		//enetr city
		driver.findElement(By.name("city")).sendKeys("Annandale");
		//enter state
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("22003");
		driver.findElement(By.id("email")).sendKeys("denis");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("register")).click();
		
		
		String str=driver.findElement(By.cssSelector("tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) p:nth-child(2)>font:nth-child(1)")).getText();
		
		
		
		if(str.contains("Thank you for registering")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("the test case failed");
		}
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
