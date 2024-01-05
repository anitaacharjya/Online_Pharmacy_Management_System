package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Database_connection;


@WebServlet("/Delete_medicine")
public class Delete_medicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Delete_medicine() {
        super();
        
    }
Database_connection  add;
    
    public void init()
    {
	 add=new Database_connection ();
	
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id=Integer.parseInt(request.getParameter("medicine_id"));
		String medname = request.getParameter("name");
		
		// add.deletemedicine(medid);
		String historycomment = "Out of stock  "+medname ;
		
		
		
		  boolean result;
			
			result=add.delete("medicine_table","med_id",id);
			
		  
		   
		   
		   add.history(historycomment);
		   response.sendRedirect("Medicine.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
