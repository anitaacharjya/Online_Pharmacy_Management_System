package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Database_connection;


@WebServlet("/Add_employee")
public class Add_employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Add_employee() {
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
		String slno = request.getParameter("SlNo");
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String historycomment = "Add a employee name is  "+name;
		
		//System.out.println("SlNo " +slno + "name "+ name +"contact " +contact +"address " +address);
		int addemployee = add.addemployee(name, address, contact);
	     if(addemployee>0) 
	     {   
	    	 add.history(historycomment);
	    	 response.sendRedirect("Employee.jsp");
	     }
	     else {
	    	 
	     }
	    
		
		
		
		doGet(request, response);
		
	}

}
