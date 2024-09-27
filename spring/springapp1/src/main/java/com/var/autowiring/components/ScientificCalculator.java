package com.var.autowiring.components;

import org.springframework.stereotype.Component;

@Component("sc")
class ScientificCalculator   implements Calculator{
	public int operation(int a,int b) {
		return a*a+b*b;
	}

}
