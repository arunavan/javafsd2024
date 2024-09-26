package com.var.springapp1.beans;

public class Customer {
	
	String name;
	String email;
	public Customer(){
		
	}
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	

}
