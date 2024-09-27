package com.var.autowiring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service  //more app
@Component
public class CalculatorService {
	
	@Autowired
	@Qualifier("bc")
	Calculator calculator;

	public CalculatorService(){
		
	}
	
	public int callOperation(int a,int b) {
		return calculator.operation(a, b);
		
	}
	
	@Override
	public String toString() {
		return "CalculatorService [calculator=" + calculator + "]";
	}
	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public CalculatorService(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	

}
