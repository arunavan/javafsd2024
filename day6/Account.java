package com.training.day6;
public class Account {  //p, super,base
	Integer acNumber;
	Double balance;
	String name;
	public Account(Integer acNumber, Double balance, String name) {
		super();
		this.acNumber = acNumber;
		this.balance = balance;
		this.name = name;
	}
	void showAccountDetails() {
		System.out.println(acNumber +"  "+ name +"  "+ balance);
	}
}
