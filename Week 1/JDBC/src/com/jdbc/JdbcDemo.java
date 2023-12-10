package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {


			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				
			Connection conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","zqaoplkjgh");
			
			Statement stmt = conn.createStatement();
			
			//String query = " insert into employee values(502,'Ritesh',45000) ";

			//String query = " update employee set salary = 50000 where eid = 502; ";
			
			String query = "Delete from employee where eid = 501; ";


			int count =	 stmt.executeUpdate(query);
			
			System.out.println(count +" No. of records affected");
			
			String selectQuery = "Select * from employee";
			
			ResultSet rs = stmt.executeQuery(selectQuery); //  this statement is good for select query not dml query.
			
			while(rs.next())
			{
				int eid = rs.getInt("eid");
				String ename = rs.getString("ename");
				double salary = rs.getDouble("salary");
				
				System.out.println(eid+" "+ename+" "+salary);
			}
				
			conn.close();
				
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		

	}

}
