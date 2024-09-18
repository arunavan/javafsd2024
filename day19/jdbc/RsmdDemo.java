package com.training.day19.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.training.day18.jdbc2.util.JdbcUtil;

public class RsmdDemo {

	public static void main(String[] args) throws Exception{

		Connection con=JdbcUtil.getConnn();
		
		Statement st=con.createStatement();
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getMaxColumnsInIndex());
		
		ResultSet rs=st.executeQuery("select * from account");
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.print(rsmd.getColumnName(i) +"  ");
		}
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}

	}

}
