package com.noorteck.selenium.day9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitEx1 {

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("@BeforeClass method executed");
	}

	

	@Before
	public void setUp()  {
		System.out.println("@Before method executed");
	}

	
	@Test
	public void testOne() {
		System.out.println("@Test 1 method executed");
	}
	
	
	@Test
	public void testTwo() {
		System.out.println("@Test 2  method executed");
	}
	@After
	public void tearDown()  {
		System.out.println("@After method executed");
	}

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("@AfterClass method executed");
	}

	

}
