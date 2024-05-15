package Com.java.Connect;


import java.sql.*;
public class DBUtil{
	
	private static Connection con=null;
	
	private DBUtil()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ordermanagement", "root", "root");
	         
	         System.out.println("Connected to the database");
			
		}
		catch(Exception e)
		{
			System.out.println("Connected to the Database");
		}
	}
	
	public static Connection getConnect()
	{
		DBUtil d1=new DBUtil();
		return con;
	}
	
}