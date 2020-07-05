package com.noorteck.selenium.day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfElements {
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
		
		//
		
		List<WebElement> radioBtnList= driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Size of List:"+radioBtnList.size());
		
		for(WebElement radioBtn: radioBtnList ) {
			radioBtn.click();
			
			Thread.sleep(3000);
		}
		
	}
	

}
