package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Database_connection;


@WebServlet("/Delete_employee")
public class Delete_employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Delete_employee() {
        super();
        
    }

	
    Database_connection  add;
    
    public void init()
    {
	 add=new Database_connection ();
	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 
		String empname =request.getParameter("name");
		
       int id= Integer.parseInt(request.getParameter("Emp_id"));
        
		String historycomment = "Delete a employee name is "+empname;
		
		
		
	  boolean result;
		
		result=add.delete("employee_table","Emp_id",id);
		
	  
	   
	   
	   add.history(historycomment);
	   
	   response.sendRedirect("Employee.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
