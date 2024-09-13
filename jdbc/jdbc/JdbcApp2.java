package com.training.day17.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcApp2 {

	
	public static void main(String[] args) //throws ClassNotFoundException,SQLException 
	{
		//1
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//2
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
			//3
			Statement st=con.createStatement();
			PreparedStatement pst=con.prepareStatement("insert into account values(?,?,?)");
			
			System.out.println("entre 3 account details");
			Scanner sc=new Scanner(System.in);
			for(int i=1;i<=3;i++) {
				int id=sc.nextInt(); sc.nextLine();
				String name=sc.nextLine();
				Double balance=sc.nextDouble();
				pst.setInt(1, id);;
				pst.setString(2, name);
				pst.setDouble(3, balance);
				pst.executeUpdate();
			}
			
			
			
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
