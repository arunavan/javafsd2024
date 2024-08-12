package com.training.day4;

public class Account1 {
	double balance;
	
	Account1(){
		balance=10000.00;
	}
	double deposit(double amount) {
		this.balance+=amount;
		return this.balance;
	}
	
	double withdraw(double amount) {
		this.balance-=amount;
		return this.balance;
	}
	
	double getBalance() {
		return this.balance;
	}
void show() {
	System.out.println("ICICI Bank operations");
}
void showBankName(String bname) {
	System.out.println(bname+ " Bank operations");
}

	public static void main(String[] args) {
		Account1  a1=new Account1 ();
		a1.show();
		System.out.println(a1.deposit(5000.00));
		System.out.println(a1.withdraw(3000.00));
		a1.showBankName("AXIS");
		System.out.println(a1.getBalance());

	}

}
