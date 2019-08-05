package com.cgi.jdbcdemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=null;
		try
		{
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","cgi123");
		System.out.println("Connected successfully");
		//below statement holds the SQL statement 
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery("SELECT code,name from employee");
		
		while(result.next())
		{
		System.out.println(result.getString("code")+"\t"+result.getString("name"));
	}
	}finally
	{
		connection.close();
	}
}}
