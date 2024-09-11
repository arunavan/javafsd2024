package com.verizon;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculatorTest.class, CalculatorTest2.class, CalculatorTest3.class, CalculatorTest4.class,
		LoanTest.class, SumTest.class })
public class AllTests {

}
