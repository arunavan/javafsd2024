package com.var.JunitMavenApp1;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
 static Calculator c;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {  //once
		System.out.println(" before all global");
		
		c=new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		c=null;//once
		System.out.println(" after all test cases ");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println(" every test case started ");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("every test case completed");
	}

	@Test
	void testAdd() {
		assertEquals(10,c.add(5, 5)); //sample data 1
		//fail("Not yet implemented");
	}

	@Test
	@RepeatedTest(5)
	void testProduct() {
		assertNotNull(c.product(4, 5));  
		//fail("Not yet implemented");
	}
	@Test
	@Disabled
	void testProduct1() {
		assertNull(c.product(0,0));
		//fail("Not yet implemented");
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, 15,17,22,25,27}) 
	void ifEvenOrOddTest(Integer number) {
	    assertTrue(c.isOdd(number));
	}
	
	
	@ParameterizedTest
    @ValueSource(strings = {"9878675645", "897867"}) 
    void testProcessValidPhones(String phone) { 
        assertTrue(phone.length()==10); 
    } 
}
