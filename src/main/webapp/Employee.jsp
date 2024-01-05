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
     <h3> EMPLOYEE DETAILS </h3>
    <a href="Add_employee.jsp"><button type="button" class="btn btn-primary">Add New Employee</button></a>

  </div>
  
    
    <%
   
    Database_connection show_emp = new  Database_connection ();
    List<show_employee> show_data =show_emp.showemployeeprofile();
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
                 <th>Action</th>
             </tr>
           </thead>
           <tbody>
              <%
             
          	int total=1;
          	 
          	 
          		 
          	 
              for(show_employee a:show_data){
              %>
            <tr>
                
                <td><%out.print(total);%></td>
                
               <td><%=a.getEmployee_name()%></td>
                <td><%=a.getContact_details()%></td>
                <td><%=a.getAddress() %></td>
                <td>
                  <a href="<%= request.getContextPath()%>/Edit_employee.jsp?Emp_id=<%=a.getEmp_id()%>&name=<%=a.getEmployee_name()%>"><button type="button" class="btn btn-primary">Edit</button></a>

               <a href="<%= request.getContextPath()%>/Delete_employee?Emp_id=<%=a.getEmp_id()%>&name=<%=a.getEmployee_name() %>">  <button type="button" class="btn btn-danger">Deete</button></a> 
                </td>
            </tr>
           
            <%
            total++;
            } %>
           </tbody>
    </table>
  
</body>
</html>