package com.nooretck.selenium.day10;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5 {

	

	WebDriver driver;
	String url;
	@Before
	public void setUp() throws Exception {
	
	//set up system property
	
	String chromeKey="webdriver.chrome.driver";
	String chromePath="src\\test\\resources\\driver\\chromedriver.exe";
	System.setProperty(chromeKey, chromePath);
	//create driver object
	
	driver = new ChromeDriver();
	
	//implicit wait 
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//maximize the page
	driver.manage().window().maximize();
	
	url="https://opensource-demo.orangehrmlive.com";
	driver.get(url);
	

}
	
	@Test
	public void test() {
		
		//driver.findElement(by)
		
		
	}

	@After
	public void tearDown() throws Exception {
	}


}
