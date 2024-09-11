package com.verizon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		
		Calculator c=new Calculator();
		assertEquals(11,c.sum(5, 6));
		//fail("Not yet implemented");
	}

	@Test
	void testDiff() {
		Calculator c=new Calculator();
		assertEquals(-1,c.diff(5, 6));
	
		//fail("Not yet implemented");
	}

	@Test
	void testProduct() {
		Calculator c=new Calculator();
		assertEquals(30,c.product(5, 6));
	
		//fail("Not yet implemented");
	}

	@Test
	void testDiv() {
		Calculator c=new Calculator();
		assertEquals(3,c.div(15, 3));
	
		//fail("Not yet implemented");
	}

}
