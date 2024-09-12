package com.training.day16.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product1 {
	Integer id;
	String name;
	Double qty;
	Double price;
	public Product1(Integer id, String name, Double qty, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
}

/*
class IdComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		 Product1 p1=(Product1)o1;
		 Product1 p2=(Product1)o2;
		 
		 if(p1.id>p2.id)
			 return 1;
		 else if(p1.id<p2.id) 
			 return -1;
		 else 
			 return 0;
			 
		}
	
}
class NameComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		 Product1 p1=(Product1)o1;
		 Product1 p2=(Product1)o2;
		
	  return  p1.name.compareTo(p2.name)  ;   //+1  -1 0
	}
	
}
class PriceComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		 Product1 p1=(Product1)o1;
		 Product1 p2=(Product1)o2;
		 
		 if(p1.price>p2.price)
			 return 1;
		 else if(p1.price<p2.price) 
			 return -1;
		 else 
			 return 0;
			 
		}	
}
class QtyComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		 Product1 p1=(Product1)o1;
		 Product1 p2=(Product1)o2;
		 
		 if(p1.qty>p2.qty)
			 return 1;
		 else if(p1.qty<p2.qty) 
			 return -1;
		 else 
			 return 0;
			 
		}
}

class ProductService1{
	static List<Product1> productList=new ArrayList<>();
	//static Set<Product> productList=new TreeSet<>();
	static {
		productList.add(new Product1(4,"bag",289.0,200.00));
		productList.add(new Product1(2,"cookingbook",839.0,800.00));
		productList.add(new Product1(1,"table",829.0,600.00));
		productList.add(new Product1(3,"apron",189.0,200.00));
		productList.add(new Product1(4,"pen",389.0,300.00));
	}
	
	void sortProducts() {
		
		Collections.sort(productList,new IdComparator());
	}
	
	void displayProducts() {
		
		for(Product1 p:productList)
			System.out.println(p);
	}
	
}
*/
public class ComparatorDemo {

	public static void main(String[] args) {
	/*	ProductService1 ps=new ProductService1();
		System.out.println(" before ============");
		ps.displayProducts();
		
		ps.sortProducts();
		System.out.println(" after ============");
		
		ps.displayProducts();
		*/
		
		List<Product1> plist=Arrays.asList( new Product1(4,"bag",289.0,200.00),
				new Product1(8,"table",89.0,200.00),
				new Product1(6,"socket",29.0,100.00),
				new Product1(2,"can",79.0,800.00));
		
	//	System.out.println(plist);
		System.out.println("before sorting....");
		plist.forEach(p->System.out.println(p));
		System.out.println("before sorting....");
		Comparator<Product1> comp=(p1,p2)->p1.qty.intValue()-p2.qty.intValue();
		plist.stream().sorted(comp).forEach(p->System.out.println(p));
		
		
	}
}
