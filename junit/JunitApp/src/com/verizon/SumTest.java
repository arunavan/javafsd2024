package com.verizon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void testAdd() {
		Sum s=new Sum();
		assertEquals(7,s.add(4, 3));
		
		//fail("Not yet implemented");
	}

}
