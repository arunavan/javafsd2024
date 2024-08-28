package com.training.day9nday10;

import java.util.Scanner;



public class CustomExceptionDemo {

	public static void main(String[] args) throws DepositException
	{
		
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();  //1000
		if(amount<1000)
			throw new DepositException("minimum deposit is 100/-");
		else
		 System.out.println("Deposit is done, thank you");		

	}

}
