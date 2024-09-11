package com.var;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LoanTest {

	@Test
	void testGetEmi() {
		Loan l=new Loan();
		int actual=l.getEmi(60000);
		int expected =5000;
		Assert.assertEquals(actual,expected);
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testGetEmi1() {
		Loan l=new Loan();
		int actual=l.getEmi(80000);
		int expected =6666;
		Assert.assertEquals(actual,expected);
		
		//fail("Not yet implemented");
	}

}
