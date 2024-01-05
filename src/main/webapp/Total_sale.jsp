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
    <link rel="stylesheet" href="style.css">
    <title>purches.jsp</title>
</head>
<body>
    <div class="header1">
       
        <a href="index.jsp"><button type="button" class="btn btn-primary">Home</button></a>
        <h3> TOTAL SALE </h3>
        <a href="Add_sale.jsp"><button type="button" class="btn btn-primary">Add new sale</button></a>
    
      </div>
       <%
   
    Database_connection show_sale = new  Database_connection ();
   List<show_sale>show_data=show_sale.showsale();
    System.out.println("After getting data ");
    System.out.println("After getting data  "+show_data);


    %>


    <table class="Content">
           <thead>
             <tr> 
                 <th>SL.No</th>
                 <th>Name</th>
                 <th>Contact_Details</th>
                 <th>Address</th>
                 <th>Purchase_medicine</th>
                 <th>Total_Cost</th>
                 <th>Date</th>
                 
                 
                 
             </tr>
           </thead>
           <tbody>
           <%
           int total=1;
         
           for(show_sale e:show_data){
           %>
              <tr>
                 <td><%out.print(total);%></td>
                  <td><%=e.getName()%></td>
                  <td><%=e.getContact_details()%></td>
                  <td><%=e.getAddress()%></td>
                  <td><%=e.getPurchase_medicine()%></td>
                  <td><%=e.getTotal_cost()%></td>
                  <td><%=e.getDate()%></td>
                  
                  
                  
                  
              </tr>
              
            
             <%
            total++;
            } %>
            
            
           </tbody>
    </table>
</body>
</html>
