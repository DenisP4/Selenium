package com.noorteck.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo extends CommonUI {
	
	static WebElement e1,e2,e3,e4;
	
	public static void main(String[] args) {
		
		openBrowser("chrome");
		navigate("https://www.google.com/");
		
		click(e1);
		click(e2);
		click(e3);
		
		//String myText= getText(e4);
		
	}
	
	public static void myElement() {
		e1=driver.findElement(By.id("bmwcheck"));
		e2=driver.findElement(By.id("benzcheck"));
		e3=driver.findElement(By.id("hondacheck"));
		e4=driver.findElement(By.xpath("//td[contains(text(),'JavaScript Programming Language')]"));
		
	}
	
	

}
