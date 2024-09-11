package com.verizon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AccountTest {
AccointInt a;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		a=new Account();
	}

	@AfterEach
	void tearDown() throws Exception {
		a=null;
	}

	@Test
	void testWithdraw() {
		assertEquals(a.deposit(),5000);
		//fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testDeposit() {
		//fail("Not yet implemented");
	}

}
