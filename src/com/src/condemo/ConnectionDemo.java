package com.src.condemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

//import com.mysql.cj.xdevapi.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver loaded");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String Url = "jdbc:mysql://localhost:3306/managementsystem";
		String UserName = "root";
		String Password = "Sourabhwandare@15";
		
		try {
			Connection con = DriverManager.getConnection(Url, UserName, Password);
			
			Statement st =con.createStatement();
			
			//String insertQuery = "insert into customerdetails values(10,'Shekhar', 'Pune')";
				//int row = st.executeUpdate(insertQuery)	;
				
				//st.executeUpdate("update customerdetails set CustomerName = 'Prajakta' where idCustomerDetails = 5");
				
				System.out.println("Row entered");
			ResultSet resultSet = st.executeQuery("select * from customerdetails");
			
			while (resultSet.next()) {
				
				
				System.out.println("id   " +resultSet.getInt("idCustomerDetails"));
				System.out.println("Name " +resultSet.getString("CustomerName"));
				
				
			}
			
			System.out.println("Connection sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("Sucess");

	}

}
