package com.training.day6;

public class SavingsAccount  extends Account{
	String bankName;
	String company;
	
	void dispBankDetails() {
		System.out.println("BankName:"+bankName);
		System.out.println("Name:"+name);
		System.out.println("Balance:"+balance);
		System.out.println("Account Number:"+acNumber);
		
	}
	public SavingsAccount(Integer acNumber, Double balance, String name, String bankName, String company) {
		super(acNumber, balance, name);
		this.bankName = bankName;
		this.company = company;
	}
	void show() {
		showAccountDetails();
	}
	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount(101,20000.00,"Ram","ICICIBANK","Verizon");
		sa.dispBankDetails();
		sa.show();
		sa.showAccountDetails();
	}

}
