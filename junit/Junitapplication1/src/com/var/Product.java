package com.var;

public class Product {
  Integer id;
  @Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + "]";
}
public Product(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
String name;
  

public String updateName() {
	return this.name.toUpperCase();
}
}
