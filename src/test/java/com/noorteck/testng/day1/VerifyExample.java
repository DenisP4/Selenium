package com.noorteck.testng.day1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class VerifyExample {
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }
  
  @Test
  public void f() {
	  
		  int num1=10;
		  int num2=4;
		  
		  int addResult=num1+num2;
		  
		  int subResult=num1-num2;
		  
		  int mulResult=num1*num2;
		  
		  int divResult=num1/num2;
		  
		  //create object of SoftAssert Class
		  SoftAssert softAssert = new SoftAssert();
		  
		  softAssert.assertEquals(addResult, 14);
		  
		  softAssert.assertEquals(subResult, 2);//NOT right
		  
		  softAssert.assertEquals(mulResult, 99);//NOT right 
		  
		  softAssert.assertEquals(divResult, 1);// NOT right
		  
		  softAssert.assertAll();
		  
	  }
  
  @Test 
  public void testTwo() {
	  
	  SoftAssert softAssert=new SoftAssert();
	  
	  boolean isSunday=true;
	  
	  softAssert.assertTrue(isSunday);
	  
	  softAssert.assertAll();
  }
  
  @Test 
  public void caseThree() {
	  
	  SoftAssert softAssert=new SoftAssert();
	  
	  softAssert.assertNotEquals("Google", "Google");
	  softAssert.assertAll();
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
