package com.var.springapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.var.springapp1.beans.Customer;
import com.var.springapp1.beans.Order;

public class App 
{
	
    public static void main( String[] args )
    {   //IOC container   - create beans, destroying, lifecycle, scope
    	
    //	BeanFactory ioc=new XMLBeanFactory(new FileSystemResource("beans.xml"));
    	ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext(
				"beans.xml");
    	
    	//object creation,destruction ,lifecycle, scope 
    	
    	Order o=(Order)ioc.getBean("o");
    	Order o1=(Order)ioc.getBean("o");
    	
    	Order o2=(Order)ioc.getBean("o");
    	System.out.println(o.hashCode() +"  "+o1.hashCode()  +"  "+ o2.hashCode());
    	o.setAmount(9999.99);
    	o.setId(102);
    	System.out.println(o.getId()+"  "+o.getAmount());
    	
    	
    	Customer c=(Customer)ioc.getBean("c");
    	System.out.println(c);
    	
    	ioc.close();
        
    }
}


/*



//static Order order;
 // order=new Order();  //Dependency
       // order.setAmount(10000.00);
      //  order.setId(101);
       // System.out.println(order.getId()+"  "+order.getAmount());
   


*/