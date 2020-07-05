package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/index.php");
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		/**
		 * Method getText() will return String value,The value will be returned will be displayed on the page
		 * 
		 * 
		 */
		String strText=driver.findElement(By.xpath("//font[contains(text(),'Enter your user information to access the member-o')]")).getText();
		
		driver.findElement(By.name("UserName")).sendKeys("tutorial");
		
		
		driver.findElement(By.name("Password")).sendKeys("tutorial");
		
		driver.findElement(By.className("login")).click();
		
		
		
		
	}

}
