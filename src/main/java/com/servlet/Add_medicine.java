package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Database_connection;


@WebServlet("/Add_medicine")
public class Add_medicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Add_medicine() {
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
		String price = request.getParameter("price");
		String date = request.getParameter("date");
		String stock = request.getParameter("stock");
		String historycomment = "New medicine add name is  "+name;
		int addmedicine = add.addmedicine(name, price, date, stock);
		if(addmedicine>0) {
			add.history(historycomment);
			response.sendRedirect("Medicine.jsp");
		}
		
		else {
			
		}
		
		//System.out.println("SlNo " +slno + "name "+ name +"price " +price +"date " +date +"stock " +stock);
		
		doGet(request, response);
	}

}
