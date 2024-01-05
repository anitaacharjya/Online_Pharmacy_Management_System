package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Database_connection;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        
    }
 Database_connection  add;
    
    public void init()
    {
	 add=new Database_connection ();
	
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user= request.getParameter("Username_form");
		String password =request.getParameter("Password_form");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print(user);
		out.print(password);
		
		try {
			if(add.login(user, password)) {
				response.sendRedirect("index.jsp");
				
			}
			else{
				HttpSession session=request.getSession();
                session.setAttribute("LoginError", "Invalid Credentials");
				response.sendRedirect("Login.jsp");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   
		doGet(request, response);
	}

}
