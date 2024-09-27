package com.var.autowiring.components;

import org.springframework.stereotype.Component;

@Component("bc")
public class BusinessCalculator  implements Calculator{
	public int operation(int a,int b) {
		return a+b;
	}

}
