package com.noorteck.selenium.day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {
	
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(url);
		
		// String str=driver.findElement(By.xpath("//td[contains(text(),'JavaScript Programming Language')]")).getText();
		
		// System.out.println(str);
		 
		    //retrieving list of  headers from table 
	       List<WebElement> header= driver.findElements(By.xpath("//tr//th"));
	       
	       //retrieving list of rows from table
		   List<WebElement> rowData=driver.findElements(By.xpath("//tr//td"));
		   
		   for(WebElement h: header) {
			   System.out.print(h.getText()+"\t\t\t\t");
		   }
		   
		   System.out.println("\n-----------------------------------------------");
		   
		   int count=0;
		   
		   for(WebElement d: rowData) {
			   System.out.print(d.getText()+"\t\t");
			   
			   count++;
			   if(count% 3==0) {
				   System.out.println();
			   }
		   }
		
		   
		   Thread.sleep(3000);
		   driver.quit();
	}
	
	

}
