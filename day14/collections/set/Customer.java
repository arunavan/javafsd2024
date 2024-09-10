package com.training.day14.collections.set;

import java.util.Objects;

public class Customer {
	
	Integer id;
	String name;
	Customer(){
		
	}
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	/*
	 * public int hashCode() { return 1; } public boolean equals(Object o) {
	 * Customer c=(Customer)o; boolean flag=false; if( this.id==c.id &&
	 * this.name.equals(c.name)) flag=true;
	 * 
	 * return flag; }
	 */
	
	
	/*
	 * @Override public int hashCode() { return Objects.hash(id, name); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Customer other = (Customer) obj; return Objects.equals(id, other.id)
	 * && Objects.equals(name, other.name); }
	 */
	
	

}
