<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <form action="<%= request.getContextPath()%>/Add_medicine" method="post">
        
        <div class="container">
          <h1>Add new medicine</h1>
         
          <hr>
      
      
          <label for="name"><b>Medicine_Name</b></label>
          <input type="text" placeholder="Enter Medicine_Name" name="name" id="name" required>
      
          <label for="price"><b>Current_Price</b></label>
          <input type="number" placeholder="Price" name="price" id="price" required>
          <label for="address"><b>Exp.date</b></label>
          <input type="number" placeholder="Exp.date" name="date" id="date" required>
          <label for="address"><b>Stock</b></label>
          <input type="number" placeholder="Stock" name="stock" id="stock" required>
          <hr>
          
      
          <button type="submit" class="registerbtn">Add</button>
        </div>
   
</body>
</html>