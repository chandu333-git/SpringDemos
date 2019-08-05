package com.cgi.jdbcdemo1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=null;
		try
		{
		connection =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Assignment_1","root","cgi123");
		
		String sql=("DELETE FROM employee WHERE code=?,name=?");
		
	
		System.out.println("ENTER THE CODE TO BE DELETED");
		int code=scan.nextInt();
		System.out.println("ENTER THE NAME TO BE DELETED");
		String name=scan.next();
		
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setInt(1,code);
		statement.setString(2,name);
		System.out.println(sql);
		int n=statement.executeUpdate();
	if(n>0)
		{
		System.out.println("Record insert Successfully");
	}
	}finally
	{
		connection.close();
	}
}}
