package com.training.day19.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import com.training.day18.jdbc2.util.JdbcUtil;

public class CallableDemo {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Connection con=JdbcUtil.getConnn();
		// x, x*x   sq
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter input");
		//int x=sc.nextInt();
		//CallableStatement cst=con.prepareCall(" { CALL sq1(?,?) }");
		//cst.setInt(1, x);
		//cst.registerOutParameter(2,Types.INTEGER);
		//cst.execute();
		//int result=cst.getInt(2);
		//System.out.println("Result(square)"+result);
		System.out.println("enter id");
		int id=sc.nextInt();
		CallableStatement cst=con.prepareCall(" { CALL getbalance(?,?) }");
		cst.setInt(1, id);
		cst.registerOutParameter(2,Types.INTEGER);
		cst.execute();
		int balance=cst.getInt(2);
		System.out.println("For given account available balance is Rs."+balance);
		
	}

}
/*

create or replace procedure sq1(x in number,y out number) as
 begin
  y:=x*x;
 end;



 1  create or replace procedure getbalance(id1 in number,balance1 out number) as
  2  begin
  3  select balance into balance1 from account where id=id1;
  4* end;
SQL> /
*/