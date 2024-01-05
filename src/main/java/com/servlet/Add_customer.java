package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Database_connection;


@WebServlet("/Add_customer")
public class Add_customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Add_customer() {
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
		String historycomment = "Add a customer name is  "+name;
		
		//System.out.println("SlNo " +slno + "name "+ name +"contact " +contact +"address " +address);
		int addcustomer= add.addcustomer(name,contact , address);
		if(addcustomer>0) {
			add.history(historycomment);
			 response.sendRedirect("Customer.jsp");
		}
		else {
			
		}
		
		doGet(request, response);
	}

}
