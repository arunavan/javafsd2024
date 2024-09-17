package com.training.day18.jdbc2.service;

import java.sql.SQLException;
import java.util.List;

import com.training.day18.jdbc2.dao.AccountDao;
import com.training.day18.jdbc2.model.Account;

public class AccountService {
	AccountDao dao=new AccountDao();
	
	public void addAccount(Account account)throws ClassNotFoundException,SQLException {
		dao.addAccount(account);
		System.out.println("added in service");
	}
	 public Account getAccount(Integer id)throws ClassNotFoundException,SQLException{
		   return dao.getAccount(id);
	  }
  public List<Account> getAllAccounts()throws ClassNotFoundException,SQLException{
	   return dao.getAllAccounts();
  }
}
