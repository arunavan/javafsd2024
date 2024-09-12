package com.training.day16.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable{
	Integer id;
	String name;
	Double qty;
	Double price;
	public Product(Integer id, String name, Double qty, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public int compareTo(Object o) {
	 Product p1=(Product)o;
	//   return  this.name.compareTo(p1.name)  ;   //+1  -1 0
	 
	 if(this.qty>p1.qty)
		 return -1;
	 else if(this.qty<p1.qty) 
		 return +1;
	 else 
		 return 0;
		 
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
}


class ProductService{
	static List<Product> productList=new ArrayList<>();
	//static Set<Product> productList=new TreeSet<>();
	static {
		productList.add(new Product(4,"bag",289.0,200.00));
		productList.add(new Product(2,"cookingbook",839.0,800.00));
		productList.add(new Product(1,"table",829.0,600.00));
		productList.add(new Product(3,"apron",189.0,200.00));
		productList.add(new Product(4,"pen",389.0,300.00));
	}
	
	void sortProducts() {
		
		Collections.sort(productList);
	}
	
	void displayProducts() {
		
		for(Product p:productList)
			System.out.println(p);
	}
	
}


public class ComparableDemo {

	public static void main(String[] args) {
		ProductService ps=new ProductService();
		System.out.println(" before ============");
		ps.displayProducts();
		
		ps.sortProducts();
		System.out.println(" after ============");
		ProductService ps=new ProductService();
		System.out.println(" before ============");
		ps.displayProducts();
		
		ps.sortProducts();
		System.out.println(" after ============");
		
		ps.displayProducts();
		ps.displayProducts();

	}

}
