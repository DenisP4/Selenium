package com.nooretck.selenium.day10;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	WebDriver driver;
	String url;

	@Before
	public void rightClick() throws Exception {
		
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
		
		url="http://demo.guru99.com/test/simple_context_menu.html";
		driver.get(url);
	}
	
		

	@Test
	public void rightClick1() throws Exception {
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement rClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		WebElement copy=driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));
		
		actions.contextClick(rClick).build().perform();
		actions.moveToElement(copy).click().build().perform();
       
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		
		alert.accept();
		
		
		
	}
	
	@Test
	public void doubleClick() throws InterruptedException {
		Thread.sleep(2000);
		
         Actions actions=new Actions(driver);
		
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		
		//doubleclick 
		actions.doubleClick(doubleClickButton).build().perform();
		Thread.sleep(2000);
		
		Alert alert =driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		
		alert.accept();
	}
	
	
	
	

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	

	

}
