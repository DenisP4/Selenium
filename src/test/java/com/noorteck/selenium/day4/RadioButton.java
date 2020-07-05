package com.noorteck.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		           "src\\test\\resources\\driver\\chromedriver.exe");
		
         WebDriver driver=new ChromeDriver();
         
         driver.get("https://learn.letskodeit.com/p/practice");
         driver.manage().window().maximize();
 		
         //created radio1 button for BMW object
         WebElement radio1=driver.findElement(By.id("bmwradio"));
         
        // boolean radioIsDisplayed=radio1.isDisplayed();
         //returns true or false
         boolean radioIsSelected=radio1.isSelected();
         
         
         if(!radioIsSelected) {
        	 radio1.click();
        	 System.out.println("BMW Button is selected Now");
         }else {
        	 System.out.println("BMW Radio Button is already Selected");
         
         
         
         
       /**  boolean radio=driver.findElement(By.id("bmwradio")).isSelected();
         if(radio != radioIsSelected) {
        	radio=driver.findElement(By.id("bmwradio")).isSelected();
        	System.out.println("BMW Radio Button is selected Now");
         }else {
        	 System.out.println("BMW Radio Button is already Selected");
       */ 	
        	
        	 
         }
         Thread.sleep(5000);
         //created web element for benz Radio Button
         WebElement radio2=driver.findElement(By.id("benzradio"));
         
         //create boolean variable
         boolean radio2IsDisplayed=radio2.isDisplayed();
         boolean radio2IsSelected=radio2.isSelected();
         
        	 Thread.sleep(5000);
        	 
        	 if(radio2IsDisplayed==true && radio2IsSelected==false) {
        		 radio2.click();
        		 System.out.println("Benz Radio Button is selected Now");
        	 }else {
        		 System.out.println("Cannot select Benz Radio Button");
        	 }
        	 
        	 Thread.sleep(5000);
        	 
        	 //create object for honda element
        	  WebElement honda= driver.findElement(By.id("hondaradio"));
        	  
        	    honda.click();
        	    
        	 boolean hondaIsDisplayed= honda.isDisplayed();  //is Displayed
        	 boolean hondaIsSelected= honda.isSelected();   //is Selected 
        	 boolean hondaIsEnabled= honda.isEnabled();     //is Enable
        	 
             if(hondaIsDisplayed==true && hondaIsSelected==true && hondaIsEnabled==true ) {
            	 driver.findElement(By.partialLinkText("Login")).click();
        	
              System.out.println(hondaIsDisplayed);
              System.out.println(hondaIsSelected);
              System.out.println(hondaIsEnabled);
        		 }
        	 
             Thread.sleep(1000);
             String title="Let's Kode it";
             //create variable for getTitle
        	 String pageTitle=driver.getTitle();
                if(title.equals(pageTitle)){
        		 System.out.println("Test Case Passed");
        		 
        	 }else {
        		 System.out.println("Test Case Failed");
        	 }
        	 
        	 driver.close();
         }
	}



