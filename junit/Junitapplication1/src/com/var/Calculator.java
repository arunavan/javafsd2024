package com.var;

public class Calculator {

	
	public int add(int a,int b) {
		return a+b;
		
	}
	
	
	public int product(int a,int b) throws ArithmeticException {
		if ((a<0) || (b<0))
			throw new ArithmeticException("Operation cannot be done");
		else
			
		return a*b;s
		
	}
}
