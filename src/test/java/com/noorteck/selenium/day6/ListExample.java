package com.noorteck.selenium.day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListExample {
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
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		
		String s1="input[id= 'confirmbtn']";
		
		String s2="input[id=\"confirmbtn\"]";
		
	}

}
