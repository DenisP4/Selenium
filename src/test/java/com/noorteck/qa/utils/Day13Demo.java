package com.noorteck.qa.utils;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day13Demo  extends CommonUI {
	
	String url="https://letskodeit.teachable.com/p/practice";   
	String browser="chrome";

	@Before
	public void setUp() {
		NGdb.connectToDB();
		openBrowser(browser);
		navigate(url);
	}

	@Test
	public void test() throws InterruptedException {
		
		WebElement el=driver.findElement(By.id("carselect"));
		
		selectFromDropdown(el,"index","2");
		
		Thread.sleep(3000);
		selectFromDropdown(el,"value","bmw");
	
		
		Thread.sleep(3000);
		selectFromDropdown(el,"Text","Benz");
		
		
		Thread.sleep(3000);
		selectFromDropdown(el,"Sunday","Benz");
		
		NGdb.executeQuery("Select * From employees" );
	}
	
	
	
	
	@After
	public void tearDown()  {
		
		quitBrowser();
		
	}

	
}
