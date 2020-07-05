package com.noorteck.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	
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
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		//create alert object
		Alert alert=driver.switchTo().alert();
		
		String alertText=alert.getText();
		
		System.out.println("Alert Text"+alertText);
		Thread.sleep(2000);
		
		//click OKAY
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#bmwcheck")).click();
		
		
		Thread.sleep(5000);
		
		
		
		System.out.println("=================================================");
		
		//click on confirm
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		
		//create alert object
		Alert alertConfirm=driver.switchTo().alert();
		
		System.out.println("Confirm Message:"+alertConfirm.getText());
		//cancel pop-up
		alertConfirm.dismiss();
		Thread.sleep(2000);
		
		//click benz radio button
		driver.findElement(By.cssSelector("#benzradio")).click();
		
	}

}
