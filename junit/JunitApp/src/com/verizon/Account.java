package com.verizon;

public class Account implements AccointInt {
	
	
	@Override
	public int withdraw() {
		return 1000;
	}

	@Override
	public int deposit() {
		return 5000;
	}
}
