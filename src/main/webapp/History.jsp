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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="style.css">
    <title>Employee Details</title>
    <script>
        function myFunction() {
          let text = "Sure,are you want to delete ?";
          if (confirm(text) == true) {
            text = "You pressed OK!";
          } else {
            text = "You canceled!";
          }
        }
        </script>
</head>
<body>
  <div class="header1">
   
    <a href="index.jsp"><button type="button" class="btn btn-primary">Home</button></a>
    
            <h3>HISTORY </h3>
    

  </div>
    <% 
     Database_connection show_history = new  Database_connection ();
    List<showHistory>show_data=show_history.showhistory();
    
    %>

    <table class="Content">
           <thead>
             <tr> 
                 <th>SL.No</th>
                 <th>Date</th>
                 <th>Description</th>
                 
             </tr>
           </thead>
           <tbody>
           <%
           int total=1;
         
           for(showHistory h:show_data){
        	   
           
           %>
           
              <tr>
                  <td><%out.print(total);%></td>
                <td><%=h.getOpration()%></td>
               
                <td><%=h.getDate()%></td>
                 
                  
                  
              </tr>
              <%
            total++;
            } %>
           
            
           </tbody>
    </table>
</body>
</html>