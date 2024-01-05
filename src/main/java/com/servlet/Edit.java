package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Database_connection;


@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Edit() {
        super();
       
    }
Database_connection  add;
    
    public void init()
    {
	 add=new Database_connection ();
	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id= Integer.parseInt(request.getParameter("SlNo"));
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String historycomment = "Update employee name is  "+name +" Update employee contact is " +contact + " Update employee Address is "+address;
		
		//System.out.println("SlNo " +slno + "name "+ name +"contact " +contact +"address " +address);
		int editemployee = add.editemployee(id,name, address, contact);
	     if(editemployee>0) 
	     {   
	    	 add.history(historycomment);
	    	 response.sendRedirect("Employee.jsp");
	     }
	     else {
	    	 
	     }

		
		doGet(request, response);
	}

}
