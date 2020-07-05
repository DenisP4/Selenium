package com.noorteck.testng.day1;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SimpleMath {
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  System.out.println("@BeforeMethod");
  }
  
  
  @Test
  public void f() {
	  
	  System.out.println("@Test f");
  }
  
  @Test
  public void testcaseOne() {
	  
	  String expectedName="Malek";
	  
	  String actualName="Cena";
	  
	  //check if expectedName is same as actualNmae
	 
	  if(expectedName.equals(actualName)) {
		  System.out.println("Name matches: Test case passed");
	  }else {
		  System.out.println("Name does not match: Test case Failed");
	  }
  }
  
  @Test
  public void testCaseTwo() {
	  
	  String expectedName="Malek";
	  String actualName="Cena";
	  
	  Assert.assertEquals(actualName, expectedName); //false -->failed
	  Assert.assertEquals("Malek", "Cena");//false--> failed
	  
	  System.out.println("This should not execute");
  }
	@Test
	public void testCaseThree() {
		
		 String expectedName="Malek";
		  String actualName="Cena";
		  
	
	  Assert.assertNotEquals(actualName, expectedName);// passed-->because its true
	  
	  System.out.println("After assertNotEqual");
  }
	
	@Test
	public void testCasefour() {
		
		boolean isSunday=true;
		boolean isMonday=true;
		
		boolean isTuesday=false;
		
		Assert.assertTrue(isSunday);
		Assert.assertTrue(isMonday);
		Assert.assertTrue(isTuesday);
		
		
		
	}
	
	@Test
	public void caseTestFive() {
		boolean isSunday=false;
		boolean isMonday=true;
		
		Assert.assertFalse(isSunday);
		Assert.assertFalse(isMonday);
	}
	
	@Test
	public void testcaseSix() {
		
		String name=null;
		
		Assert.assertNull(name);
		
		Assert.assertNull("John"); //will get an exception
	}
	
	@Test
	public void testCaseSeven() {
		String name="Selenium";
		Assert.assertNotNull(name);
	}

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("@AfterMethod");
  }

}
