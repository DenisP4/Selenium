package com.noorteck.selenium.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WarmupEx {
	
	public static void main(String[] args) throws InterruptedException {
		

		String chromeKey= "webdriver.chrome.driver";
		String chromePath="src\\test\\resources\\driver\\chromedriver.exe";
		
		//set up property
		System.setProperty("webdriver.chrome.driver", 
				           "src\\test\\resources\\driver\\chromedriver.exe");
		
		String url="http://demo.automationtesting.in/Index.html";
		
		System.setProperty(chromeKey, chromePath);
		
		
		//create driver object
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("#btn2")).click();
		
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Denis");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Putina");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("4950 Sunset ln");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("denis_putina@yahoo.com");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("7038259700");
		driver.findElement(By.xpath("//label[1]//input[1]")).click();
		
		
		 WebElement radio=driver.findElement(By.xpath("//label[1]//input[1]"));
		
		 
		 driver.findElement(By.xpath("//input[@id='checkbox3']")).isSelected();
		 
		  
		 Select sObj=new Select(driver.findElement(By.cssSelector("#Skills")));		 
		 sObj.selectByVisibleText("Java");
		 
		 Select country=new Select(driver.findElement(By.cssSelector("#countries")));
		 country.selectByVisibleText("Moldova");
		 
		 Select birthdate=new Select(driver.findElement(By.cssSelector("#yearbox")));
		 birthdate.selectByValue("1986");
		 
		 Select month=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		 month.selectByVisibleText("May");
		 
		 Select day=new Select(driver.findElement(By.cssSelector("#daybox")));
		 day.selectByValue("19");
		 
		 driver.findElement(By.cssSelector("#firstpassword")).sendKeys("Moldova1");
		 driver.findElement(By.cssSelector("#secondpassword")).sendKeys("Moldova1");
		 driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		 
		 Thread.sleep(2000);
		 driver.quit();
		 
		 System.out.println("Registration was successful");
		 
	}

}
