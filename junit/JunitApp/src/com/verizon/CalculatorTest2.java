package com.verizon;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class CalculatorTest2 {
	Calculator c;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(" testing class started");	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(" testing ended");	}
	@BeforeEach
	void setUp() throws Exception {
		System.out.println(" testing each case method  started");
		 c=new Calculator();	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println(" text case object is teared down ");
		c=null;	}
	@Test
	void testSum() {
		
		assertEquals(11,c.sum(5, 6));
		//fail("Not yet implemented");
	}

	@Test
	void testDiff() {
		assertEquals(-1,c.diff(5, 6));
	
		//fail("Not yet implemented");
	}

	@Test
	void testProduct() {
		assertEquals(30,c.product(5, 6));
	
		//fail("Not yet implemented");
	}

	@Test
	void testDiv() {
		assertEquals(5,c.div(15, 3));
	
		//fail("Not yet implemented");
	}


}
