package com.training.day17.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp1 {

	
	public static void main(String[] args) //throws ClassNotFoundException,SQLException 
	{
		//1
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//2
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
			//3
			Statement st=con.createStatement();
			
			
			//st.executeUpdate("create table account(id number , name varchar(20),balance number) ");
			
			st.executeUpdate("insert into account values(105,'ram',9999.99)");
			st.executeUpdate("insert into account values(106,'ram2',9999.99)");
			//st.executeUpdate("insert into account values(103,'ram3',9999.99)");
			//st.executeUpdate("insert into account values(104,'ram4',9999.99)");
int count=	st.executeUpdate("update account set balance=10000.00 where id=103");
int count1=	st.executeUpdate("delete from account  where id=104");
			
			
			System.out.println(" done .");
			
			ResultSet rs=st.executeQuery("select * from account");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		//st.close();
		//con.close();
		
	}
}
