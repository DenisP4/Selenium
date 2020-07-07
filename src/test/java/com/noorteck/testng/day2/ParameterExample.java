package com.noorteck.testng.day2;

import org.testng.annotations.Test;

import com.noorteck.qa.utils.CommonUI;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ParameterExample extends CommonUI {
 
  @BeforeMethod
  public void beforeMethod(String browser,String url) {
	  
	  openBrowser(browser);
	  navigate(url);
	  
  }
  
  @Test
  public void f() {
  }

  @AfterMethod
  public void afterMethod() {
	  
	  quitBrowser();
  }

}
