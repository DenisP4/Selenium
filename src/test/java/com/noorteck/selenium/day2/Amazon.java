package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Head First Java 2nd Edition");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Head First Java, 2nd Edition");
		
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='sb_2vdjSJEF']//div[2]//a[1]//div[1]//div[1]//div[1]//img[1]")).click();
		
		driver.findElement(By.linkText("Add to Cart")).click();
		
		driver.findElement(By.xpath("//title[contains(text(),'Amazon.com Shopping Cart')]"));
		driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("drochia12@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.id("hlb-ptc-btn-native"));
		
		String str="There was problem";
		
		
		if(str.contains("There was a problem")) {
			System.out.println("Test case past");
		}else {
			System.out.println("Test case failed");
		}
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
	}

}
