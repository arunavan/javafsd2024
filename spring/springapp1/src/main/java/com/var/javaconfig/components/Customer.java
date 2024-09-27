package com.var.javaconfig.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //singleton
@Scope("singleton")
public class Customer {
	
	String name;
	String email;
	public Customer(){
		
	}
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	

}
