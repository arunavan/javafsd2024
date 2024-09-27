package com.var.autowiring.components;

import org.springframework.stereotype.Component;

@Component
public interface Calculator {
	int operation(int a,int b);

}
