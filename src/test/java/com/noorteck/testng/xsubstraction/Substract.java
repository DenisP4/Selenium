package com.noorteck.testng.xsubstraction;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Substract {
 
	
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("Substract Class: @BeforeMethod");
	  }
	  
	  @Test
	  public void addTwoNum() {
		  
		  int n1=10;
		  int n2=20;
		  
		  int result=n1-n2;
		  System.out.println(n1 + "-" + n2 + "=" + result);
		  
		  
	  }
	  
	  @Test
	  public void addThreeNum() {
		  
		  int n1=10;
		  int n2=20;
		  int n3=30;
		  
		  int result=n1+n2+n3;
		  System.out.println(n1 + "-" + n2 +" - " + n3 + "=" + result);
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  System.out.println("Sustract Class:@AfterMethod");
	  }

	}
