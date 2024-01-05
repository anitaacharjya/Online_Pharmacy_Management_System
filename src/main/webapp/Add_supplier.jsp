<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <link rel="stylesheet" href="add.css">
    <title>reg_from.html</title>
</head>
<body>
  
   
    <form action="<%= request.getContextPath()%>/Add_supplier" method="post">
        
        <div class="container">
          <h1>Add new supplier</h1>
         
          <hr>
      
          
      
          <label for="name"><b>Name</b></label>
          <input type="text" placeholder="Enter name" name="name" id="name" required>
      
          <label for="contact"><b>Contact_Details</b></label>
          <input type="number" placeholder="Mob.No" name="contact" id="contact" required>
          <label for="address"><b>Address</b></label>
          <input type="text" placeholder="Address" name="address" id="address" required>
          <hr>
          
      
          <button type="submit" class="registerbtn">Add</button>
        </div>
   
  

</body>
</html>