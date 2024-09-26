package com.var.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.var.javaconfig.components.Bill;

import com.var.javaconfig.components.Customer;
public class BillTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
	     Bill bill=(Bill)context.getBean(Bill.class);
	     bill.setId(105);
	     bill.setType("Mobile bill");
	     System.out.println(bill.getType()+"  "+bill.getId());
	     
	    Customer c= (Customer)context.getBean(Customer.class);
	    c.setEmail("abc@gmail.com");
	    c.setName("abc");
	    System.out.println(c);
	}

}
