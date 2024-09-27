package com.var.autowiring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("account") //spring managable bean
public class Account {     //Account has Loan   -- has a   @Autowired
	
	Integer id;
	String name;
	Double balance;
	
	//@Autowired
	Loan loan;
	
	public Account(){
		
	}
	
	public Account(Integer id, String name, Double balance, Loan loan) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.loan = loan;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Loan getLoan() {
		return loan;
	}
	@Autowired
	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", loan=" + loan + "]";
	}
	

}
