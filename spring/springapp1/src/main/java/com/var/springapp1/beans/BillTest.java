package com.var.springapp1.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.var.javaconfig.components.Bill;

public class BillTest {

	public static void main(String[] args) {
		
		//Bill b=new Bill();
		//System.out.println(b.id+"  "+b.type);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Bill b= (Bill)context.getBean("bill");
        System.out.println(b.getId()+"  "+b.getType()   +"  "+b.hashCode());
        Bill b1= (Bill)context.getBean("bill");
        System.out.println(b1.getId()+"  "+b1.getType() +"  " +b1.hashCode());
       
        
        Customer c=(Customer)context.getBean(Customer.class);
        System.out.println(c   +"  "+c.hashCode());
        Customer c1=(Customer)context.getBean(Customer.class);
        System.out.println(c1  +"   "+c1.hashCode());
        
        
	}

}
