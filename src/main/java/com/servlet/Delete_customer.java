package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Database_connection;


@WebServlet("/Delete_customer")
public class Delete_customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Delete_customer() {
        super();
       
    }
    Database_connection add;
    public void init()
    {
	 add=new Database_connection ();
	
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id=Integer.parseInt(request.getParameter("Customer_id"));
		String cusname =request.getParameter("name");
		System.out.println("delete customer :");
		 //add.deletecustomer(cusid);
		String historycomment = "Delete a customer name is "+cusname;
		
		
		
		  boolean result;
			
			result=add.delete("customer_table","Customer_id",id);
			
		  
		   
		   
		   add.history(historycomment);
		
		   response.sendRedirect("Customer.jsp");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	

}
