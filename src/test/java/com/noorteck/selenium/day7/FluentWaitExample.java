package com.noorteck.selenium.day7;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {
	
	public static void main(String[] args) {
		

		String chromeKey= "webdriver.chrome.driver";
		String chromePath="src\\test\\resources\\driver\\chromedriver.exe";
		
		//set up property
		System.setProperty("webdriver.chrome.driver", 
				           "src\\test\\resources\\driver\\chromedriver.exe");
		
		String url="https://learn.letskodeit.com/p/practice";
		System.setProperty(chromeKey, chromePath);
		
		//create driver object
		WebDriver driver=new ChromeDriver();
		
		//maximize the windows
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
 Wait wait =new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
	
        driver.findElement(By.xpath("//input[@type='checkbox11111111']"));
	
		
	}

}
