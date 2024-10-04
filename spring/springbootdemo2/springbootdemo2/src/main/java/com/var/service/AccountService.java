package com.var.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.var.model.Account;

@Service
public class AccountService {
	
	static List accountList=new ArrayList<>();
	
	public void addAccount(Account account) {
		accountList.add(account);
		System.out.println(" added...in service ");
	}
	
	public List<Account> listAccounts() {
		accountList.forEach(a->System.out.println(a));
		return accountList;
	}
	public void updateAccount(Integer id) {
		System.out.println("account update in service");
	}
	
	public void deleteAccount(Integer id) {
		accountList.remove(id);
		/*
		 * Iterator<Account> i=accountList.iterator(); System.out.println(accountList);
		 * while(i.hasNext()) { Account a=(Account)i.next(); if(a.getId()==id) {
		 * i.remove(); //accountList.remove() } } System.out.println(accountList);
		 */
		System.out.println(accountList);
		System.out.println("deleted");
	}
	
	

}
