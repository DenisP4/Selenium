package com.noorteck.qa.utils;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUI {
	
	static WebDriver driver;
	
	/**
	 * This method 
	 * 
	 * 
	 */
	public static void openBrowser(String browser) {
		
		try {
			switch(browser.toLowerCase()) {
			
			case"firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
				
			case "ie":
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
				break;
				
				default:
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					
			}
			
		}catch(Exception e) {
			System.out.println("We do not support["+browser+"] browser. Make sure to pass [chrome,firefox or ie]");
		}
	}
	
	
	/**
	 * 
	 * This method takes 1 string parameter ,sets implicit wait ,maximizes and navigates to the web-page
	 * 
	 * @param url
	 */
	public static void navigate(String url) {
		
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
			
		}catch (Exception e) {
			
			System.out.println("Check the ["+url+"] URL ,make sure it contains proper format");
			e.printStackTrace();
		}
	}
	
	public static boolean isDisplayed(WebElement element) {
		
		try {
		return	element.isDisplayed();

		
		}catch (NoSuchElementException e) {
			System.out.println("Element does not exist,it is not displayed:"+ element);
			e.printStackTrace();
			
			return false;
		}
	}
	
	public static boolean isEnabled(WebElement element) {
		try {
	 return	element.isEnabled();
			
		}catch (NoSuchElementException e) {
			System.out.println("Element does not exist,is not enabled" + element);
			e.printStackTrace();
			return false;
		}
		
	}
	
	/**
	 * This method takes 1 WebElement parameter 
	 * 
	 */
	
	public static void click(WebElement element) {
		
		if(isDisplayed(element)) {
			element.click();
		}
	}
	
	public static String getTitle() {
		
		String titleStr = null;
		try {
			titleStr=driver.getTitle();
			
		}catch (Exception e) {
			System.out.println("Driver instance is NULL");
			e.printStackTrace();
		}
		return titleStr;
	}
	
	
	//handle drop down 
	/**
	 * drop downs--select tag
	 *   can be accesed by selectByIndex,selectByVisualText,selectByValue
	 * 
	 */
	
	
	public static void selectFromDropdown(WebElement element,String methodName,String indexTextValue) {
		
		try {
			Select sObj=new Select(element);
			String methodStr=methodName.toLowerCase();
			
			if(methodStr.contains("index")) {
				
				int index=Integer.parseInt(indexTextValue);//converts String to integer type
				
				sObj.deselectByIndex(index);
				
			}else if(methodStr.contains("value")) {
				
				sObj.selectByValue(indexTextValue);
			}else if(methodStr.contains("text")) {
			 
				sObj.deselectByVisibleText(indexTextValue);
			}else {
				System.out.println("Drop down can be selected only with [index,value,or text] check parameters passed");
			
			}
			
			
		}catch (Exception e) {
			System.out.println("Unable to find web element");
			e.printStackTrace();
		}
	}
 
    public static void quitBrowser() {
    	
    try {
    Thread.sleep(3000);
    		driver.quit();
     }catch (Exception e ) {
	System.out.println("Driver object is null");
	e.printStackTrace();
	
    }
    }
    
    public static boolean isAlertPresent() {
    	
    	boolean isAlert=false;
    	
    	try {
    		WebDriverWait wait =new WebDriverWait(driver,3);
    		
    		if(wait.until(ExpectedConditions.alertIsPresent()) !=null) {
    			isAlert=true;
    				
    		}
    		
    	}catch (NoAlertPresentException e) {
    		System.out.println("Alert is not present");
    		e.printStackTrace();
    	}
    	return isAlert;
      	
    }
    
   
    
    /**
     * This method accepts the Alert
     * 
     */
    
    public static void acceptAlert() {
    	
    	if(isAlertPresent()) {
    		Alert alert=driver.switchTo().alert();
    		
    		alert.accept();
    				
    	}
    }
    
    
    /**
     * 
     * this method will dismiss the alert
     */
    
    public static void disnissAlert() {
    	
    	if(isAlertPresent()) {
    		Alert alert=driver.switchTo().alert();
    		alert.dismiss();
    	}
    }
    }

