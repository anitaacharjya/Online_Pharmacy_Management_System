package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.show_employee;

public class Database_test {
public static void main(String[] args) {

		
	try{
	Class.forName("com.mysql.jdbc.Driver");

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
	//Statement stmt=con.createStatement();

	System.out.println("table created");
	String query  = "select *from employee_table"; 
	 Statement st = con.createStatement();
	 ResultSet rs = st.executeQuery(query);
	int total=0;
	 
	 while(rs.next()) {
		 int Emp_id=rs.getInt("Emp_id");
		 String Name=rs.getString("Employee_name");
		 String Contact_details=rs.getString("Employee_address");
		 System.out.println("COMING FROM DATABASE name = " +Emp_id+" Name = " +Contact_details);
		// total=total+salary;
		 
	 }
	 System.out.println("Total value =" +total);

	con.close();
		}catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
			
		}

		}
public void showemployeeprofile() throws ClassNotFoundException, SQLException
{
	List<show_employee>showpro=new ArrayList<show_employee>();
	try{
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anita?","root","anita");
		//Statement stmt=con.createStatement();

		System.out.println("table created");
		
		String query  = "select *from Tbl_med_employee"; 
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery(query);
		int total=0;
		/*
		 * while(rs.next()) { System.out.println("Inside while loop");
		 * 
		 * show_employee c=new show_employee();
		 * 
		 * c.setEmp_id(rs.getInt("Emp_id")); c.setEmployee_name(rs.getString("Name"));
		 * c.setContact_details(rs.getString("Contact_details"));
		 * c.setAddress(rs.getString("Address")); showpro.add(c);
		 * 
		 * }
		 */

		 while(rs.next()) {
			 int Emp_id=rs.getInt("Emp_id");
			 String Name=rs.getString("Name");
			 String Contact_details=rs.getString("Contact_details");
			 System.out.println("COMING FROM DATABASE name = " +Emp_id+" Name = " +Contact_details);
			// total=total+salary;
			 
		 }
		System.out.println("List "+ showpro);
	}
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
			
		}
	//return showpro;
}		

	}




