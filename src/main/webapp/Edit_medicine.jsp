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
    <form action="#">
        
        <div class="container">
          <h1>Edit Medicine</h1>
         
          <hr>
      
          <label for="Sl.No"><b>SL.No</b></label>
          <input type="number" placeholder="Sl.No" name="Sl.No" id="Sl.No" required>
      
          <label for="name"><b>Medicine_Name</b></label>
          <input type="text" placeholder="Enter Medicine_Name" name="name" id="name" required>
      
          <label for="price"><b>Current_Price</b></label>
          <input type="number" placeholder="Price" name="contact" id="contact" required>
          <label for="address"><b>Exp.date</b></label>
          <input type="number" placeholder="Exp.date" name="address" id="address" required>
          <label for="address"><b>Stock</b></label>
          <input type="number" placeholder="Stock" name="address" id="address" required>
          <hr>
          
      
          <button type="submit" class="registerbtn">Register</button>
        </div>
</body>
</html>