package com.noorteck.selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String chromeKey= "webdriver.chrome.driver";
		String chromePath="src\\test\\resources\\driver\\chromedriver.exe";
		
		//set up property
		System.setProperty("webdriver.chrome.driver", 
				           "src\\test\\resources\\driver\\chromedriver.exe");
		
		String url="https://learn.letskodeit.com";
		
		System.setProperty(chromeKey, chromePath);
		
		
		//create driver object
		WebDriver driver=new ChromeDriver();
		//maximize the windows
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
		
		driver.findElement(By.id("bmwcheck")).click();
		
		
		//switch to iframe
		driver.switchTo().frame("course-iframe");
		
		System.out.println("Inside Iframe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-course-button")).sendKeys("Java");
		
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		System.out.println("Trying to ckick honda check wich is outside the iframe");
		
		driver.findElement(By.cssSelector("#hondacheck")).click();
		
		Thread.sleep(2000);
		
		
		
		
	}

}
