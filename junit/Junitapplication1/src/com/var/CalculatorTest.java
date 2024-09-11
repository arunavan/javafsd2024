package com.var;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import junit.framework.Assert;

class CalculatorTest {
	
	static Calculator c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {   //once
		System.out.println(" before class");
		c=new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(" after class");
		c=null;
	}

	@BeforeEach
	void setUp() throws Exception {   //for every test case 
		System.out.println(" before test method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println(" after test method");
	}

	@Test
	@Disabled
	void testAdd() {
		Assert.assertEquals(10, c.add(4, 6));
		
		
		//fail("Not yet implemented");
	}

	@Test
	@RepeatedTest(5)
	void testProduct() {
		Assert.assertEquals(18, c.product(3, 6));
		
		//fail("Not yet implemented");
	}
	@Test//(expected=ArithmeticException.class)
	@Timeout(1000)
	void testProduct2() {
		
	//	if() 
		//	throw new ArithmeticException("");
	    
		Assert.assertEquals(18, c.product(3, 6));
		
		//fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, 15,17,22,25,27,89,678,8796}) 
	void ifEvenOrOddTest(Integer number) {
	    assertTrue(number%2!=0);
	}
	
	
	@ParameterizedTest
    @ValueSource(strings = {"9878675645", "8978678798","3234546787"}) 
    void testProcessValidPhones(String phone) { 
        assertTrue(phone.length()==10); 
    } 
}
