package com.var.springapp1.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	
	
	@Bean
	@Scope("prototype")
	public Customer customer() {
		return new Customer("ram","ram@gmail.com");
	}
	

}
