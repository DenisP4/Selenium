package com.noorteck.selenium.day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
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
		
		driver.get(url);
		
		//create an object of Select class
		
		Select sObj=new Select(driver.findElement(By.id("multiple-select-example")));
		System.out.println(sObj.isMultiple());
		
		//select orange by value
		sObj.selectByValue("orange");
		Thread.sleep(5000);
		
		//de-select orange by value
		sObj.deselectByValue("orange");
		Thread.sleep(5000);
		
		//select peach by index
		sObj.selectByIndex(2);
		
		Thread.sleep(5000);
		
		//select apple by visible text
		sObj.selectByVisibleText("Apple");
		Thread.sleep(2000);
		
		//print all selected options
		
		sObj.getAllSelectedOptions();
		List<WebElement> fruitList=sObj.getAllSelectedOptions();
		
		
		for (WebElement fruit: fruitList) {
			String str=fruit.getText();
			  System.out.println(str);
			  
		
		}
		
		Thread.sleep(2000);
		sObj.deselectAll();
	}

}
