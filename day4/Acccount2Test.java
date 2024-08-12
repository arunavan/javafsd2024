package com.training.day4;

public class Acccount2Test {

	public static void main(String[] args) {
		Account2 a1=new Account2();
		
		System.out.println(a1.name+"  "+a1.acNumber);
		a1.setAcNumber(123);
		a1.setName("Kiran");
		System.out.println(a1.getName()+  " "+a1.getAcNumber());		
	}

}
