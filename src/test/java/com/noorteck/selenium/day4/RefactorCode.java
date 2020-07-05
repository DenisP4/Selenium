package com.noorteck.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefactorCode {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String chromeKey= "webdriver.chrome.driver";
		String chromePath="src\\test\\resources\\driver\\chromedriver.exe";
		String url="https://amazon.com/";
		String url2 ="https://yahoo.com/";
		
		//set up property
		System.setProperty("webdriver.chrome.driver", 
				           "src\\test\\resources\\driver\\chromedriver.exe");
		
		System.setProperty(chromeKey, chromePath);
		
		
		//create driver object
		WebDriver driver=new ChromeDriver();
		
		//maximize window to avoid issues
		driver.manage().window().maximize();
		driver.get(url);
		
		//String title=driver.getTitle();
		
		//WebElement searchFieldElement=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		driver.navigate().to(url2);
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
	}

}
