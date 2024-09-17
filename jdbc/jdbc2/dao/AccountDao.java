package com.training.day18.jdbc2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.day18.jdbc2.model.Account;
import com.training.day18.jdbc2.util.JdbcUtil;

public class AccountDao {  //db management , i,d,u,r   CRUD
	
	public void addAccount(Account account) throws ClassNotFoundException,SQLException{
		Connection con=JdbcUtil.getConnn();
		
		PreparedStatement pst=con.prepareStatement("insert into Account values(?,?,?)");
		pst.setInt(1, account.getId());
		pst.setString(2, account.getName());
		pst.setDouble(3, account.getBalance());
		pst.execute();  //insert into db
		
		System.out.println(" added in dao");

	}

	

	public List<Account> getAllAccounts()throws ClassNotFoundException,SQLException {
		Connection con=JdbcUtil.getConnn();
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from account");
		List<Account> accountList=new ArrayList<>();
		
		
		while(rs.next()) {
			//System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			Account account=new Account();
			account.setId(rs.getInt(1));
			account.setName(rs.getString(2));
			account.setBalance(rs.getDouble(3));
			accountList.add(account);
		}
		return accountList;

	}

 
  public Account getAccount(Integer id) throws ClassNotFoundException,SQLException{
	   Connection con=JdbcUtil.getConnn();
		PreparedStatement pst=con.prepareStatement("select * from account where id=?");
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		Account account=new Account();
		while(rs.next()) {
			account.setId(rs.getInt(1));
			account.setName(rs.getString(2));
			account.setBalance(rs.getDouble(3));
			
		}
		return account;

	}
	/*
	public void updateAccount(Integre id, Account account) {

	}

	public void deleteAccount(Integer id) {

	}
	*/

}
