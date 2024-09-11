package com.verizon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		Customer c=new Customer();
		assertEquals(c.getBalance(),5000);
	}

}
