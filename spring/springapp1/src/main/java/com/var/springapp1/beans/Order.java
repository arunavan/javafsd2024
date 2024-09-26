package com.var.springapp1.beans;

public class Order {
	
	Integer id;
	Double amount;
	public Order(){
		
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", amount=" + amount + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void start() {
		System.out.println(" bean ready to use ,created ");
	}
	public void stop() {
		System.out.println(" bean ready to stop ");
		
	}

}
