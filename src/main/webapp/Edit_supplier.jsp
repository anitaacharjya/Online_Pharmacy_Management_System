<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.bean.*" %>
     
    
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="add.css">
    <title>Document</title>
</head>
<body>
        
        
   <% 
    Database_connection show_sup = new  Database_connection ();
    int coming_edit_id = Integer.parseInt(request.getParameter("supplier_id"));
    List<show_supplier> show_data =show_sup.editsupplierprofile(coming_edit_id);
    System.out.println("After getting data ");
    System.out.println("After getting data  "+show_data );
    %>
    
     
     
    
    <form action="#">
      <%
       for(show_supplier data:show_data){
    	   
       %>
    	   
   
        
        <div class="container">
          <h1>Edit supplier</h1>
         
          <hr>
      
          <!-- <label for="Sl.No"><b>SL.No</b></label> -->
          <input type="hidden" value="<%=data.getSupplier_id()%>" placeholder="Sl.No" name="SlNo" id="Sl.No" required>
      
          <label for="name"><b>Name</b></label>
          <input type="text" value="<%=data.getSupplier_name()%>" placeholder="Enter name" name="name" id="name" required>
      
          <label for="contact"><b>Contact_Details</b></label>
          <input type="number" value="<%=data.getContact_details()%>" placeholder="Mob.No" name="contact" id="contact" required>
          <label for="address"><b>Address</b></label>
          <input type="text" value="<%=data.getAddress()%>" placeholder="Address" name="address" id="address" required>
          <hr>
          
      
          <button type="submit" class="registerbtn">Register</button>
        </div>
        <%} %>
        </form>
</body>
</html>