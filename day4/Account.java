package com.training.day4;

public class Account {
	//data members
	Integer acNumber; 
	String  acHolderName;
	Double balance;
	  Account(){
			this.acHolderName="ram";
			this.acNumber=101234;
			this.balance=0.0;
		  }
	 public Account(Integer acNumber, Double balance) {
	
		this.acNumber = acNumber;
		this.balance = balance;
	}
	 public Account(Integer acNumber, String acHolderName) {
	this();
		this.acNumber = acNumber;
		this.acHolderName = acHolderName;
	}
	Account(Integer acNumber, String acHolderName, Double balance) {
		this.acNumber = acNumber;
		this.acHolderName = acHolderName;
		this.balance = balance;
	}
    //method, function
	void deposit(Double amt) {
		
		this.balance+=amt;
		System.out.println("Balance:"+this.balance);
		
	}




	public static void main(String[] args) {
		Account account1=new Account();  //JVM ,memory , object, instance, ref
		Account account2=new Account();
		Account account3=new Account(4567,"Raj",8888.90);
		
		account3.deposit(2000.00);
		
		
		Account account4=new Account(456237,"Rajkumar");
		account4.deposit(3000.00);
		
		Account account5=new Account(456987,888845.90);
		account5.deposit(1000.00);
		
		System.out.println(account1.acHolderName  +" "+account1.acNumber +" "+account1.balance);
		System.out.println(account2.acHolderName  +" "+account2.acNumber +" "+account2.balance);
		System.out.println(account1.hashCode());
		System.out.println(account2.hashCode());
		account2.acHolderName="krishna";
		account2.acNumber=3456;
		account2.balance=7899.0;
		System.out.println(account4.acHolderName  +" "+account4.acNumber +" "+account4.balance);
		System.out.println(account5.acHolderName  +" "+account5.acNumber +" "+account5.balance);
			
		/*
	
		*/
	}

}
