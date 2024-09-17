package com.training.day18.jdbc2;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.training.day18.jdbc2.model.Account;
import com.training.day18.jdbc2.service.AccountService;

public class Client { //run, test,main ,ui
	static AccountService service=new AccountService();
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre account details");
		Integer id=sc.nextInt(); sc.nextLine();
		String name=sc.nextLine();
		Double amount=sc.nextDouble();
		Account a1=new Account(id,name,amount);
		service.addAccount(a1);
		
		
		System.out.println("-=----all account------");
		
		List<Account> alist=service.getAllAccounts();
		alist.forEach(a->System.out.println(a));
		
		System.out.println("-=----single account------");
		System.out.println(service.getAccount(112));
		
		
	}

}
