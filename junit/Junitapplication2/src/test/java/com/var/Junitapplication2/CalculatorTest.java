package com.var.Junitapplication2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
  static Calculator c;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c=new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		
		assertEquals(9,c.add(4, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testProduct() {
		//fail("Not yet implemented");
	}

}
