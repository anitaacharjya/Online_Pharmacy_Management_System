package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Database_connection;

/**
 * Servlet implementation class Delete_supplier
 */
@WebServlet("/Delete_supplier")
public class Delete_supplier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_supplier() {
        super();

    }
    Database_connection add;
    public void init()
    {
	 add=new Database_connection ();
	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id= Integer.parseInt(request.getParameter("Supplier_id"));
		  // add.deletesupplier(supid);
		String supname =request.getParameter("name");
		String historycomment = "Delete a supplier name is "+supname;
		
		
		
		  boolean result;
			
			result=add.delete("supplier_table","Supplier_id",id);
			
		  
		   
		   
		   add.history(historycomment);
		   response.sendRedirect("Supplier.jsp");
		   
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
