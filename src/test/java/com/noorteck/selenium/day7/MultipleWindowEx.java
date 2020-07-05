package com.noorteck.selenium.day7;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowEx {
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		//getWindowHandle() method returns the id of current window
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window Handle:"+parentWindow);
		
		//click button
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		System.out.println("Number of windows opened by Selenium:"+ allWindows.size());
		
		for(String window:allWindows) {
			System.out.println("ID:"+window);
			
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				
				//search for java book in search
				driver.findElement(By.id("search-courses")).sendKeys("Java Book");
				
				//click search box button			
				driver.findElement(By.id("search-course-button")).click();
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("bmwcheck")).click();
		
		Thread.sleep(5000);
	}

}
