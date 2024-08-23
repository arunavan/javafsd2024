package com.training.day6;



public class InheritanceDemo {

	public static void main(String[] args) {
		
		SavingsAccount sa=new SavingsAccount(101,20000.00,"Ram","ICICIBANK","Verizon");
		sa.dispBankDetails();
		sa.show();
		sa.showAccountDetails();
	}

}
