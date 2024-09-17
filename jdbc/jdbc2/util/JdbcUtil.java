package com.training.day18.jdbc2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil { //dbConnection

	public static Connection getConnn() throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.OracleDriver");//oracle,mysql,db2,sybase
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		return con;
		
	}
	
}
