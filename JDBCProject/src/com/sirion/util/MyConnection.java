package com.sirion.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static Connection con;
	static
	{
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","sirionlab","passwd");
			System.out.println("Connected...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getDbConnection() {
		return con;
	}
}
