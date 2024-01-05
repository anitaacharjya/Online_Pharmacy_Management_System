package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.showHistory;
import com.bean.show_customer;
import com.bean.show_employee;
import com.bean.show_medicine;
import com.bean.show_sale;
import com.bean.show_supplier;


public class Database_connection {

	public List<show_employee> showemployeeprofile() throws ClassNotFoundException, SQLException
	{
		List<show_employee>showpro=new ArrayList<show_employee>();
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
			//Statement stmt=con.createStatement();

			System.out.println("table created for new test");
			
			String query  = "select *from employee_table"; 
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(query);
			int total=0;
			
			  while(rs.next())
		    { 
			  System.out.println("Inside while loop");
			  
			  show_employee c=new show_employee();
			  
			  c.setEmp_id(rs.getInt("Emp_id"));
			  c.setEmployee_name(rs.getString("Employee_name"));
			  c.setContact_details(rs.getString("Employee_ph"));
			  c.setAddress(rs.getString("Employee_address"));
			  showpro.add(c);
			  
			  
			  }
			 
			
			System.out.println("List "+ showpro);
		}
			catch(Exception e)
			{
				System.out.println("Database not connected"+ e);
				
			}
		return showpro;
	}
	
	
	//delete for all
	
	public boolean delete(String tableName,String columnName, int ID) {
		System.out.println("inside function delete: ");
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		
		String query = "DELETE FROM " + tableName + " WHERE " + columnName + " = ?";
		System.out.println("sql : " + query);
        PreparedStatement pst =con. prepareStatement(query);
        pst.setInt(1,ID);
        
		
		
		result=pst.executeUpdate();
		
		
	}
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		if(result>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	//end delete for all
	
	
	//add employee
	
	public int addemployee(String name, String address , String contact ) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("insert into employee_table (Employee_name,Employee_address,Employee_ph) VALUES (?,?,?)");
		//PreparedStatement hpst=con.prepareStatement("INSERT INTO history_table(operation,date) VALUES (?,CURRENT_TIMESTAMP)");
		pst.setString(1,name);
		pst.setString(2,address);
		pst.setString(3,contact);
		//hpst.setString(1, "Add a new employee name is " + name + " ");
		 System.out.println("history");
		
		
		
		result=pst.executeUpdate();
		//result=hpst.executeUpdate();
		
	}
		
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		return result;
		
	}
	
	//End add employee
	
	//Add for All
	
	public int add(String name, String address , String contact ,String price , String date,String stock,String medicine,String cost ) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("insert into employee_table (Employee_name,Employee_address,Employee_ph) VALUES (?,?,?)");
		//PreparedStatement hpst=con.prepareStatement("INSERT INTO history_table(operation,date) VALUES (?,CURRENT_TIMESTAMP)");
		pst.setString(1,name);
		pst.setString(2,address);
		pst.setString(3,contact);
		//hpst.setString(1, "Add a new employee name is " + name + " ");
		 System.out.println("history");
		
		
		
		result=pst.executeUpdate();
		//result=hpst.executeUpdate();
		
	}
		
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		return result;
		
	}
	
	//End add for all
	
	//show customer
	
	public List<show_customer> showcustomerprofile() throws ClassNotFoundException, SQLException
	{
		List<show_customer>showpro=new ArrayList<show_customer>();
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
			//Statement stmt=con.createStatement();

			System.out.println("table created for new test");
			
			String query  = "select *from customer_table"; 
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(query);
			int total=0;
			
			  while(rs.next()) { System.out.println("Inside while loop");
			  
			  show_customer a=new show_customer();
			  
			  a.setCustomer_id(rs.getInt("Customer_id"));
			  a.setCustomer_name(rs.getString("Customer_name"));
			  a.setContact_details(rs.getString("Customer_ph"));
			  a.setAddress(rs.getString("Customer_address")); showpro.add(a);
			  
			  
			  }
			 
			
			System.out.println("List "+ showpro);
		}
			catch(Exception e)
			{
				System.out.println("Database not connected"+ e);
				
			}
		return showpro;
	}
	//end show customer
	
	//history for all
	public boolean history(String comment) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement hpst=con.prepareStatement("INSERT INTO history_table(operation,date) VALUES (?,CURRENT_TIMESTAMP)");
		hpst.setString(1,comment);
		result=hpst.executeUpdate();
	}
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		if(result>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	
	//delete customer_end
	
	//add customer
	
	public int addcustomer(String name, String contact  ,String address ) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("INSERT INTO customer_table(Customer_name,Customer_ph,Customer_address) VALUES (?,?,?)");
		pst.setString(1,name);
		pst.setString(2,contact);
		pst.setString(3,address);
		
		
		result=pst.executeUpdate();
	}
		
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		return result;
		
	}
	
	
	//add customer end
	
	//show supplier
	
	public List<show_supplier> showsupplierprofile() throws ClassNotFoundException, SQLException
	{
		List<show_supplier>showpro=new ArrayList<show_supplier>();
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
			//Statement stmt=con.createStatement();

			System.out.println("table created for new test");
			
			String query  = "select *from supplier_table"; 
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(query);
			int total=0;
			
			  while(rs.next()) { System.out.println("Inside while loop");
			  
			  show_supplier s=new show_supplier();
			  
			  s.setSupplier_id(rs.getInt("supplier_id"));
			  s.setSupplier_name(rs.getString("supplier_name"));
			  s.setContact_details(rs.getString("supplier_ph"));
			  s.setAddress(rs.getString("supplier_address"));
			  
			  showpro.add(s);
			  
			  
			  }
			 
			
			System.out.println("List "+ showpro);
		}
			catch(Exception e)
			{
				System.out.println("Database not connected"+ e);
				
			}
		return showpro;
	}
	//end show supplier
	//delete_supplier
	public boolean deletesupplier(int Supplier_id) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("delete from supplier_table where supplier_id=?");
		pst.setInt(1,Supplier_id);
		result=pst.executeUpdate();
	}
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		if(result>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	//delete_supplier end
	
	//add supplier
	
	public int addsupplier(String name, String contact  ,String address ) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("INSERT INTO supplier_table (supplier_name,supplier_ph,supplier_address)  VALUES (?,?,?)");
		pst.setString(1,name);
		pst.setString(2,contact);
		pst.setString(3,address);
		
		
		result=pst.executeUpdate();
	}
		
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		return result;
		
	}
	
	//add supplier end
	
	public List<show_medicine> showmedicine() throws ClassNotFoundException, SQLException
	{
		List<show_medicine>showpro=new ArrayList<show_medicine>();
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
			//Statement stmt=con.createStatement();

			System.out.println("table created for new test");
			
			String query  = "select *from medicine_table"; 
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(query);
			int total=0;
			
			  while(rs.next()) { System.out.println("Inside while loop");
			  
			  show_medicine m=new show_medicine();
			  
			 m.setMedicine_id(rs.getInt("med_id"));
			 m.setMedicine_name(rs.getString("medicine_name"));
			 m.setCurrent_price(rs.getFloat("current_price"));
			 m.setExp_date(rs.getString("exp_date"));
			 m.setStock(rs.getInt("stock"));
			  
			  showpro.add(m);
			  
			  
			  }
			 
			
			System.out.println("List "+ showpro);
		}
			catch(Exception e)
			{
				System.out.println("Database not connected"+ e);
				
			}
		return showpro;
	}

	
	  //delete_medicine
	  
	public boolean deletemedicine(int medicine_id) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("delete from medicine_table where med_id=?");
		pst.setInt(1,medicine_id);
		result=pst.executeUpdate();
	}
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		if(result>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	  
	  //delete_medicine end
	
	//add medicine
	
	public int addmedicine(String name, String price , String date,String stock  ) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("INSERT INTO medicine_table (medicine_name,current_price,exp_date,stock)  VALUES (?,?,?,?)");
		pst.setString(1,name);
		pst.setString(2,price);
		pst.setString(3,date);
		pst.setString(4,stock);
		
		
		result=pst.executeUpdate();
	}
		
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		return result;
		
	}
	
	
	//add medicine end
	 
	
	
	public List<show_sale> showsale() throws ClassNotFoundException, SQLException
	{
		List<show_sale>showpro=new ArrayList<show_sale>();
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
			//Statement stmt=con.createStatement();

			System.out.println("table created for new test");
			
			String query  = "select *from sale_table"; 
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(query);
			int total=0;
			
			  while(rs.next()) { System.out.println("Inside while loop");
			  
			  show_sale s=new show_sale();
			  
			  
			 s.setSL_no(rs.getInt("SL.no"));
			 s.setName(rs.getString("Name"));
			 s.setContact_details(rs.getString("Contact_details"));
			 s.setAddress(rs.getString("Address"));
			 s.setPurchase_medicine(rs.getString("Purchase_medicine"));
			 s.setTotal_cost(rs.getFloat("Total_cost"));
			 s.setDate(rs.getString("Date"));
			 
			  
			  showpro.add(s);
			  
			  
			  }
			 
			
			System.out.println("List "+ showpro);
		}
			catch(Exception e)
			{
				System.out.println("Database not connected"+ e);
				
			}
		return showpro;
	}

   //add sale

   public int addsale(String name, String contact , String address,String medicine,String cost, String date  ) {
	int result=0;
	try {
	Class.forName("com.mysql.jdbc.Driver");

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
	//Statement stmt=con.createStatement();

	System.out.println("table created for new test");
	
	PreparedStatement pst=con.prepareStatement("INSERT INTO sale_table (Name,Contact_details,Address,Purchase_medicine,Total_cost,Date)  VALUES (?,?,?,?,?,CURRENT_TIMESTAMP)");
	pst.setString(1,name);
	pst.setString(2,contact);
	pst.setString(3,address);
	pst.setString(4,medicine);
	pst.setString(5,cost);
	
	
	
	
	result=pst.executeUpdate();
 }
	
	
	catch(Exception e)
	{
		System.out.println("Database not connected"+ e);
	}
	
	return result;
	
  }

 
  
 //add sale end

//history

public List<showHistory> showhistory() throws ClassNotFoundException, SQLException
{
	List<showHistory>showpro=new ArrayList<showHistory>();
	try{
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		String query  = "select *from history_table"; 
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery(query);
		int total=0;
		
		  while(rs.next()) { System.out.println("Inside while loop");
		  
		  showHistory s=new showHistory();
		  
		  
		 s.setOpration(rs.getString("operation"));
		 s.setDate(rs.getString("date"));
		 
		 
		  
		  showpro.add(s);
		  
		  
		  }
		 
		
		System.out.println("List "+ showpro);
	}
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
			
		}
	return showpro;
}
//History end

//Login start


public boolean login(String User_id,String Password) throws ClassNotFoundException, SQLException  {
	 
	//ResultSet result = null;
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("SELECT * FROM admin_table WHERE User_id=? and Password=?");
				
		pst.setString(1,User_id);
		pst.setString(2, Password);
		
		ResultSet result=pst.executeQuery();
		if(result.next())
		{
			return true;
		}
		else 
		{
			return false;
		}
	
 }


//login end





//Edit(for show data)

public List<show_employee> editemployeeprofile( int pallab_id) throws ClassNotFoundException, SQLException
{
	List<show_employee>editemployee=new ArrayList<show_employee>();
	try{
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		
		 
		 PreparedStatement pst=con.prepareStatement( "select *from employee_table where Emp_id=? ");
			pst.setInt(1,pallab_id);
			ResultSet rs =pst.executeQuery();
		int total=0;
		
		  while(rs.next())
	    { 
		  System.out.println("Inside while loop");
		  
		  show_employee c=new show_employee();
		  
		  c.setEmp_id(rs.getInt("Emp_id"));
		  c.setEmployee_name(rs.getString("Employee_name"));
		  c.setContact_details(rs.getString("Employee_ph"));
		  c.setAddress(rs.getString("Employee_address"));
		  editemployee.add(c);
		  
		  
		  }
		 
		
		System.out.println("List "+ editemployee);
	}
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
			
		}
	return editemployee;
}

//End Edit(for show data)	
//edit employee

	public int editemployee(int id,String name, String address , String contact ) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("UPDATE employee_table SET Employee_name = ?, Employee_address= ?,Employee_ph=? WHERE EMP_id = ?");
		
		pst.setString(1,name);
		pst.setString(2,address);
		pst.setString(3,contact);
		pst.setInt(4, id);
		
		
		
		
		result=pst.executeUpdate();
		
		
	}
		
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		return result;
		
	}
	
	
	//End edit employee

//Edit customer(for show data)
	
	public List<show_customer> editcustomerprofile(int cust_id) throws ClassNotFoundException, SQLException
	{
		List<show_customer>editcustomer=new ArrayList<show_customer>();
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
			//Statement stmt=con.createStatement();

			System.out.println("table created for new test");
			
			
			 PreparedStatement pst=con.prepareStatement( "select *from customer_table where Customer_id =?");
				pst.setInt(1,cust_id);
				ResultSet rs =pst.executeQuery();
				
			int total=0;
			
			  while(rs.next()) { System.out.println("Inside while loop");
			  
			  show_customer a=new show_customer();
			  
			  a.setCustomer_id(rs.getInt("Customer_id"));
			  a.setCustomer_name(rs.getString("Customer_name"));
			  a.setContact_details(rs.getString("Customer_ph"));
			  a.setAddress(rs.getString("Customer_address")); editcustomer.add(a);
			  
			  
			  }
			 
			
			System.out.println("List "+ editcustomer);
		}
			catch(Exception e)
			{
				System.out.println("Database not connected"+ e);
				
			}
		return editcustomer;
	}



//End Edit customer(for show data)	

//edit customer

	public int editcustomer(int id,String name, String address , String contact ) {
		int result=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		PreparedStatement pst=con.prepareStatement("UPDATE customer_table SET Customer_name = ?,Customer_ph=? ,Customer_address= ? WHERE Customer_id = ?");
		
		pst.setString(1,name);
		
		pst.setString(2,contact);
		pst.setString(3,address);
		pst.setInt(4, id);
		
		
		
		
		result=pst.executeUpdate();
		
		
	}
		
		
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
		}
		
		return result;
		
	}

	
	
	//End edit customer

//Edit supplier(for show data)

public List<show_supplier> editsupplierprofile(int sup_id) throws ClassNotFoundException, SQLException
{
	List<show_supplier>showpro=new ArrayList<show_supplier>();
	try{
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?","root","root");
		//Statement stmt=con.createStatement();

		System.out.println("table created for new test");
		
		
		 

		 PreparedStatement pst=con.prepareStatement( "select*from supplier_table where supplier_id =?");
			pst.setInt(1,sup_id);
			ResultSet rs =pst.executeQuery();
		
			int total=0;
		
		  while(rs.next()) { System.out.println("Inside while loop");
		  
		  show_supplier s=new show_supplier();
		  
		  s.setSupplier_id(rs.getInt("supplier_id"));
		  s.setSupplier_name(rs.getString("supplier_name"));
		  s.setContact_details(rs.getString("supplier_ph"));
		  s.setAddress(rs.getString("supplier_address"));
		  
		  showpro.add(s);
		  
		  
		  }
		 
		
		System.out.println("List "+ showpro);
	}
		catch(Exception e)
		{
			System.out.println("Database not connected"+ e);
			
		}
	return showpro;
}
}

//end Edit supplier(for show data)





 